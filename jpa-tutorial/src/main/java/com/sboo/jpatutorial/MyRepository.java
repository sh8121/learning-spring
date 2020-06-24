package com.sboo.jpatutorial;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface MyRepository<T, Id extends Serializable> extends Repository<T, Id> {
    T save(T t);
    //    <E extends T> E save(E e);

    List<T> findAll();

    long count();
}
