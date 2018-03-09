package com.webapp.videocapitol.reservas;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.webapp.videocapitol.util.MyBatisSqlSessionFactory;

public class ReservaData implements ReservaService {
    
    private static List<ReservaModel> reservas = new ArrayList<ReservaModel>();

    public ReservaData() {
        // TODO Auto-generated constructor stub
    }

    public List<ReservaModel> findAll() {
        // TODO Auto-generated method stub
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlsession();
        try {
            ReservaMapper mapper = sqlSession.getMapper(ReservaMapper.class);
            return mapper.findAll();
        }finally {
            sqlSession.close();
        }
        //return reservas;
    }

    public List<ReservaModel> search(ReservaModel o) {
        // TODO Auto-generated method stub
        return null;
    }

    public int add(ReservaModel a) {
        // TODO Auto-generated method stub
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlsession();
        try {
            ReservaMapper mapper = sqlSession.getMapper(ReservaMapper.class);
            mapper.add(a);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        //reservas.add(a);
        return 0;
    }

    public ReservaModel update(ReservaModel u) {
        // TODO Auto-generated method stub
        return null;
    }

    public ReservaModel remove(ReservaModel r) {
        // TODO Auto-generated method stub
        return null;
    }

    public ReservaModel find(ReservaModel f) {
        // TODO Auto-generated method stub
        return null;
    }

}
