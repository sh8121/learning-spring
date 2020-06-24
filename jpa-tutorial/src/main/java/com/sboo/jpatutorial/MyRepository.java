package com.sboo.jpatutorial;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface MyRepository<T, Id extends Serializable> extends Repository<T, Id> {
//    T save(T t);
        <E extends T> E save(E e);

    List<T> findAll();

    long count();

    <E extends T> Optional<E> findById(Id id);
//    <E extends T> E findById(Id id);
}
