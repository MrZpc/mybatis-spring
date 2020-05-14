package com.zengpc.session;

import com.zengpc.Configuration;
import com.zengpc.executor.SimpleExecutor;

public class SqlSessionFactory {

    public SqlSession openSession(Configuration configuration){
        return new DefaultSqlSession(configuration,new SimpleExecutor(configuration));
    }
}
