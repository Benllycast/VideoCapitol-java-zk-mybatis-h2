package com.webapp.videocapitol.util;

import java.util.List;

public interface ModelServices<T> {

    public List<T> findAll();
    public List<T> search(T o);
    public int add(T a);
    public T update(T u);
    public T remove(T r);
    public T find(T f);
}
