package com.webapp.videocapitol.util;

import java.util.ArrayList;
import java.util.List;

public abstract class DataBase<T> {
    
    private List<T> dataset = null;

    public DataBase() {
        // TODO Auto-generated constructor stub
        if(this.dataset == null) {
            dataset = new ArrayList<T>();
        }
    }

    public List<T> getDataset() {
        return dataset;
    }

    public void setDataset(List<T> dataset) {
        this.dataset = dataset;
    }
    
    
}
