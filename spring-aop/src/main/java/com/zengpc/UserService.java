package com.zengpc;

import org.springframework.stereotype.Component;

@Component
public interface UserService {

    public void add();
    public void delete();
    public void update();
    public void select();
}
