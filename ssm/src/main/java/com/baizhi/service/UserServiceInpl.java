package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service("UserService")
@Transactional
public class UserServiceInpl implements UserService {
    @Autowired
    private UserDao userdao;
    @Override
    public List<User> findAll() {
        return userdao.findAll();
    }

    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString());
        userdao.sava(user);
    }
}
