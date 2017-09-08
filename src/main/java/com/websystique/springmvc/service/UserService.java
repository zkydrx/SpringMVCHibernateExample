package com.websystique.springmvc.service;

import com.websystique.springmvc.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-09-08
 * Time: 00:57
 * Description:
 */
public interface UserService
{
    User findById(int id);

    User findBySSO(String sso);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserBySSO(String sso);

    List<User> findAllUsers();

    boolean isUserSSOUnique(Integer id, String sso);
}
