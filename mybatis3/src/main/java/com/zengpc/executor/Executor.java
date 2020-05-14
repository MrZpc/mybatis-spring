package com.zengpc.executor;

import com.zengpc.binding.MapperMethod;

import java.util.List;

public interface Executor {
    <T> T query(MapperMethod method, Object parameter) throws Exception;
}
