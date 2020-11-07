package com.sjx.mango.core.service;

import com.sjx.mango.core.page.PageRequest;
import com.sjx.mango.core.page.PageResult;

import java.util.List;

/**
 * @author sjx
 */
public interface CrudService<T>{

    /**
     * save the record
     * @param record t
     * */
    int save(T record);

    /**
     * delete an entity by record
     * @param record t
     * */
    int delete(T record);

    /**
     * delete a list of entities
     * @param records  list
     * */
    int delete(List<T> records);

    /**
     * find an entity by id
     * @param id long
     * */
    T findById(long id);

    /**
     *
     * @param request page request
     * */
    PageResult fingPage(PageRequest request);
}
