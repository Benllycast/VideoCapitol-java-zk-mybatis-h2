package com.webapp.videocapitol.clientes;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.webapp.videocapitol.util.MyBatisSqlSessionFactory;

public class ClienteData implements ClienteService {
    
    private static long cID = 0;
    private static List<ClienteModel> clientes = new ArrayList<ClienteModel>();
    
    public ClienteData() {
        if(clientes.isEmpty()) {
           clientes.add(new ClienteModel(getID(),"1","Cliente 1","Direccion","Telefono"));
           clientes.add(new ClienteModel(getID(),"2","Cliente 2","Direccion","Telefono"));
           clientes.add(new ClienteModel(getID(),"3","Cliente 3","Direccion","Telefono"));
        }
    }

    public List<ClienteModel> findAll() {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlsession();
        try {
            ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
            return clienteMapper.findAll();
        }finally {
            sqlSession.close();
        }
        // TODO Auto-generated method stub
        //return ClienteData.clientes;
    }


    public List<ClienteModel> search(ClienteModel o) {
        // TODO Auto-generated method stub
        return null;
    }


    public int add(ClienteModel a) {
        //ClienteData.clientes.add(a);
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlsession();
        try {
            ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
            clienteMapper.add(a);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return 0;
    }


    public ClienteModel update(ClienteModel u) {
        // TODO Auto-generated method stub
        return null;
    }


    public ClienteModel remove(ClienteModel r) {
        // TODO Auto-generated method stub
        return null;
    }


    public ClienteModel find(ClienteModel f) {
        // TODO Auto-generated method stub
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlsession();
        try {
            ClienteMapper mapper = sqlSession.getMapper(ClienteMapper.class);
            return mapper.find(f.getId());
        }finally {
            sqlSession.close();
        }
        //return clientes.get(clientes.indexOf(f));
    }

    public static long getID() {
        return ++cID;
    }

    /*
    public static ClienteData init() {
        // TODO Auto-generated method stub
        return new ClienteData();
    }*/

}
