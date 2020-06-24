package com.sboo.jpatutorial;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface MyRepository<T, Id extends Serializable> extends Repository<T, Id> {
//    T save(T t);
        <E extends T> E save(E e);

    List<T> findAll();

    long count();

    @Nullable
    <E extends T> E findById(Id id);
//     <E extends T> Optional<E> findById(Id id);

}
