package com.zengpc.session;


import com.zengpc.Configuration;
import com.zengpc.binding.MapperMethod;
import com.zengpc.binding.MapperProxy;
import com.zengpc.executor.Executor;

import java.lang.reflect.Proxy;

public class DefaultSqlSession implements SqlSession {
    private Configuration configuration;
    private Executor executor;

    public DefaultSqlSession(Configuration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public Configuration getConfiguration() {
        return configuration;
    }



    @Override
    public <T> T selectOne(MapperMethod mapperMethod,Object statement) throws Exception {
        return executor.query(mapperMethod,statement);
    }


    @Override
    public <T> T getMapper(Class<T> type) {
        return (T) Proxy.newProxyInstance(type.getClassLoader(), new Class[]{type},new MapperProxy<>(this,type));
    }

}
