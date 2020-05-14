package com.zengpc.session;

import com.zengpc.Configuration;

import java.io.IOException;

public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build(Configuration configuration) throws IOException {
        configuration.loadConfigurations();
        return new SqlSessionFactory();
    }
}
