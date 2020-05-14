package com.zengpc.binding;

/**
 * 把解析得sql加载到类中
 * @param <T>
 */
public class MapperMethod<T> {

    private String sql;
    private Class<T> type;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }


    public MapperMethod() {
    }

    public MapperMethod(String sql, Class<T> type) {
        this.sql = sql;
        this.type = type;
    }

    public Class<T> getType() {
        return type;
    }

    public void setType(Class<T> type) {
        this.type = type;
    }
}
