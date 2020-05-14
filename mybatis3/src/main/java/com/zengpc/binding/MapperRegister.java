package com.zengpc.binding;

import java.util.HashMap;
import java.util.Map;

//注册中心
public class MapperRegister {

    private Map<String,MapperMethod> knownMappers = new HashMap<>();

    public Map<String, MapperMethod> getKnownMappers() {
        return knownMappers;
    }

    public void setKnownMappers(Map<String, MapperMethod> knownMappers) {
        this.knownMappers = knownMappers;
    }
}
