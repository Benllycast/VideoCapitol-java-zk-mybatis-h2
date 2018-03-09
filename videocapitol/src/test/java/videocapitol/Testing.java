package videocapitol;

import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.webapp.videocapitol.util.MyBatisSqlSessionFactory;

public class Testing {
    public static Logger logger = LoggerFactory.getLogger(Testing.class);
    
    public Testing() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Testing.testConnection();
        Testing.insertData();
        
    }
    
    public static void testConnection() {
        
        Connection connection = MyBatisSqlSessionFactory.getConnection();
        try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.error("algo salio mal");
        }
        
        logger.info("Todo bien!!!");
    }
    
    public static void insertData() {
        Connection connection = null;
        Reader reader = null;
        try {
            connection = MyBatisSqlSessionFactory.getConnection();
            ScriptRunner runner = new ScriptRunner(connection);
            reader = Resources.getResourceAsReader("sql/drop_tables.sql");
            runner.runScript(reader);
            logger.info("drop tables OK");
            
            reader = Resources.getResourceAsReader("sql/create_tables.sql");
            runner.runScript(reader);
            logger.info("create tables OK");
            
            reader = Resources.getResourceAsReader("sql/insert_data.sql");
            runner.runScript(reader);
            logger.info("insert data OK");
            
            connection.commit();
            runner.closeConnection();
            logger.info("Todo bien!!!");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("algo salio mal");
        }
        
    }

}
