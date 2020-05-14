package com.zengpc.session;


import com.zengpc.binding.MapperMethod;

public interface SqlSession {
    <T> T selectOne(MapperMethod mapperMethod, Object statement) throws Exception;

    <T> T getMapper(Class<T> type);
}
