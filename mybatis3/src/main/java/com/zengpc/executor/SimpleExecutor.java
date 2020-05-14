package com.zengpc.executor;

import com.zengpc.Configuration;
import com.zengpc.binding.MapperMethod;

public class SimpleExecutor implements Executor {
    private Configuration configuration;

    public SimpleExecutor(Configuration configuration) {
        this.configuration = configuration;
    }


    @Override
    public <T> T query(MapperMethod method, Object parameter) throws Exception {
        return null;
    }
}
