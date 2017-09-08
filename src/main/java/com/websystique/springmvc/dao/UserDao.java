package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-09-08
 * Time: 00:49
 * Description:
 */
public interface UserDao
{
    User findById(int id);

    User findBySSO(String sso);

    void save(User user);

    void deleteBySSO(String sso);

    List<User> findAllUsers();
}
