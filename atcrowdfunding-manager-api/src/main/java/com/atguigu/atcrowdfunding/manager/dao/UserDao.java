package com.atguigu.atcrowdfunding.manager.dao;

import com.atguigu.atcrowdfunding.bean.User;

public interface UserDao {
    User queryLoginUser(User user);
}
