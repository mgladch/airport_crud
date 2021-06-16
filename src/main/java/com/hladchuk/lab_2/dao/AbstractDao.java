package com.hladchuk.lab_2.dao;

import java.util.List;

public interface AbstractDao <T>{
    public void save(T object);
    public void removeById(int id);
    public T findById(int id);
    public List<T> findAll();
}
