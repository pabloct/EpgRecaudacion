package com.pabloct.epgrecaudacion.helper;

import java.util.List;

public interface GenericCrud<T> {

    List<T> all();

    T find(Long id);

    void save(T t);

    void update(T t);

    void delete(T t);

}
