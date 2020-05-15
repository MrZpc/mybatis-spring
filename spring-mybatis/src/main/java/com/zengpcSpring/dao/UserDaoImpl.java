package com.zengpcSpring.dao;

import com.zengpcSpring.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
    @Override
    @Transactional
    public List<User> getUsers() {
        return getSqlSession().getMapper(UserDao.class).getUsers();
    }

    @Override
    public int delete(String rowId) {
        return getSqlSession().getMapper(UserDao.class).delete(rowId);
    }

    @Override
    public int insertInfo(User user) {
        return getSqlSession().getMapper(UserDao.class).insertInfo(user);
    }
}
