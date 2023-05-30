package pro.sky.skyprodb.service;

import pro.sky.skyprodb.model.Employee;

import java.util.List;

public  interface CrudDao<T> {

    //создание
    void create(T employee);

    T readById(long id, Class a);

    //получение всех объектов
    List<T> readAll();
    void update(T employee);
    void delete(T employee);
}