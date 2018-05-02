package com.webapp.videocapitol.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<TeoriaCaso> teorias = new ArrayList<TeoriaCaso>();
    private static List<String> personas = new ArrayList<String>();
    private static List<String> bienes = new ArrayList<String>();
    private static int idTeoriaCaso = 100;
    
    static {
        teorias.add(new TeoriaCaso(new BigDecimal("1"), "n1", "n1", "n1", "n1"));
        teorias.add(new TeoriaCaso(new BigDecimal("2"), "n2", "n2", "n2", "n2"));
        teorias.add(new TeoriaCaso(new BigDecimal("3"), "n3", "n3", "n3", "n3"));
        teorias.add(new TeoriaCaso(new BigDecimal("4"), "n4", "n4", "n4", "n4"));
        teorias.add(new TeoriaCaso(new BigDecimal("5"), "n5", "n5", "n5", "n5"));
        
        personas.add("pA");
        personas.add("pB");
        personas.add("pC");
        personas.add("pD");
        
        bienes.add("bA");
        bienes.add("bB");
        bienes.add("bC");
        bienes.add("bD");
    }

    public Data() {
        // TODO Auto-generated constructor stub
    }

    public static List<TeoriaCaso> getTeorias() {
        return new ArrayList<TeoriaCaso>(teorias);
    }

    public static List<String> getPersonas() {
        return new ArrayList<String>(personas);
    }

    public static List<String> getBienes() {
        return new ArrayList<String>(bienes);
    }
    
    public static boolean addTeoriaCaso(TeoriaCaso tc) {
        tc.setId(new BigDecimal(String.valueOf(teorias.size())));
        return teorias.add(tc);
    }
    
    public static TeoriaCaso deleteTeoriaCaso(TeoriaCaso tc) {
        int index = teorias.indexOf(tc);
        return (index > -1)? teorias.remove(index) : null;
    }
    
    public static TeoriaCaso updateTeoriaCaso(TeoriaCaso tc) {
        int indexOf = teorias.indexOf(tc);
        return teorias.set(indexOf, tc);
    }
}
