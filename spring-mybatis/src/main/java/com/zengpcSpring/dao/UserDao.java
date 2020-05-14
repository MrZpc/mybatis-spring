package com.zengpcSpring.dao;


import com.zengpcSpring.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> getUsers();

    int delete(String rowId);

    int insertInfo(User user);
}
