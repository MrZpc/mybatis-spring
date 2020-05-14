package com.zengpc;

import com.zengpc.dao.UserDao;
import com.zengpc.pojo.User;
import com.zengpc.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {

    @org.junit.Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> users = userDao.getUsers();
        System.out.println(users.toString());
        sqlSession.commit();
        sqlSession.close();
    }
}
