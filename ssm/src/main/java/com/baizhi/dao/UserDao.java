package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {
    //查询
    public List<User> findAll() ;
    //保存
    public void sava(User user);
    
}
