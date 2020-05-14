package com.zengpc.dao;

import com.zengpc.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface UserDao {
    List<User> getUsers();
}
