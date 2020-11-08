package com.sjx.mango.core.page;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.List;

public class MybatisPageHelper{

    public static final String findPage = "findPage";

    public static PageResult findPage(PageRequest request, Object mapper){
        return null;
    }


    /**
     * @param request request
     * @param mapper  dao
     * @param args args
     * @param queryMethodName name of method you call*/
    @SuppressWarnings({"unchecked","rawtypes"})
    public static PageResult findPage(PageRequest request, Object mapper,String queryMethodName,
                                      Object... args) {
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        Class clz = mapper.getClass();
        try {
            Method method = clz.getDeclaredMethod(queryMethodName);
            Object result = ReflectionUtils.invokeMethod(method,mapper,args);
            return getPageResult(request, new PageInfo((List)result));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static PageResult getPageResult(PageRequest request, PageInfo<?> pageInfo){
        PageResult result = new PageResult();
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotalSize(pageInfo.getTotal());
        result.setTotalPages(pageInfo.getPages());
        result.setContent(pageInfo.getList());
        return result;
    }

}
