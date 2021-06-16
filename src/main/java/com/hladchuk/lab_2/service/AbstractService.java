package com.hladchuk.lab_2.service;

import java.util.List;

public interface AbstractService <T> {

    public void save(T object);
    public void removeById(int id);
    public T findById(int id);
    public List<T> findAll();

}
