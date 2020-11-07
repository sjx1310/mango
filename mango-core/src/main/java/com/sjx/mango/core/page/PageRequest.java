package com.sjx.mango.core.page;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sjx
 */
public class PageRequest{
    private final int pageNum = 1;
    private final int pageSize = 10;

    private Map<String, Object> params = new HashMap<>();

    public int getPageNum() {
        return pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
