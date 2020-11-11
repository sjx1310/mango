package com.sjx.mango.core.service;

import com.sjx.mango.core.page.PageRequest;
import com.sjx.mango.core.page.PageResult;

import java.util.List;

/**
 * @author sjx
 */
public interface CurdService<T>{

    /**
     * save the record
     * @param record t
     * @return lines affected
     * */
    int save(T record);

    /**
     * delete an entity by record
     * @param record t
     * @return lines affected
     * */
    int delete(T record);

    /**
     * delete a list of entities
     * @param records  list
     * @return lines affected
     * */
    int delete(List<T> records);

    /**
     * find an entity by id
     * @param id long
     * @return  return a bean */
    T findById(long id);

    /**
     *find a page
     * @param request page request
     * @return  a page result
     * */
    PageResult findPage(PageRequest request);
}
