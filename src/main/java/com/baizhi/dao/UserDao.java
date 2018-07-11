package com.baizhi.dao;

import com.baizhi.entity.User;

/**
 * Created by wyx on 2018/7/11.
 */
public interface UserDao {
    public void add(User user);
    public void delete(int id);
}
