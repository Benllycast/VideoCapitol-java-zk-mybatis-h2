package com.webapp.videocapitol.peliculas;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.webapp.videocapitol.clientes.ClienteMapper;
import com.webapp.videocapitol.util.MyBatisSqlSessionFactory;

public class PeliculaData implements PeliculaService {
    
    private static long pID = 0;
    private static List<PeliculaModel> peliculas = new ArrayList<PeliculaModel>();

    public PeliculaData() {
        if(peliculas.isEmpty()) {
            peliculas.add(new PeliculaModel(getID(),"titulo 1","des","act","dir",1));
            peliculas.add(new PeliculaModel(getID(),"titulo 2","des","act","dir",2));
            peliculas.add(new PeliculaModel(getID(),"titulo 3","des","act","dir",3));
        }
    }

    public List<PeliculaModel> findAll() {
        // TODO Auto-generated method stub
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlsession();
        try {
            PeliculaMapper mapper = sqlSession.getMapper(PeliculaMapper.class);
            return mapper.findAll();
        }finally {
            sqlSession.close();
        }
        // return peliculas;
    }

    public List<PeliculaModel> search(PeliculaModel o) {
        // TODO Auto-generated method stub
        return null;
    }

    public int add(PeliculaModel a) {
        // TODO Auto-generated method stub
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlsession();
        try {
            PeliculaMapper mapper = sqlSession.getMapper(PeliculaMapper.class);
            mapper.add(a);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        //peliculas.add(a);
        return 0;
    }

    public PeliculaModel update(PeliculaModel u) {
        // TODO Auto-generated method stub
        return null;
    }

    public PeliculaModel remove(PeliculaModel r) {
        // TODO Auto-generated method stub
        return null;
    }

    public PeliculaModel find(PeliculaModel f) {
        // TODO Auto-generated method stub
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlsession();
        try {
            PeliculaMapper mapper = sqlSession.getMapper(PeliculaMapper.class);
            return mapper.find(f.getId());
        }finally {
            sqlSession.close();
        }
        //return peliculas.get(peliculas.indexOf(f));
    }
    
    public static long getID() {
        return ++pID;
    }

}
