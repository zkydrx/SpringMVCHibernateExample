package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.UserProfile;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-09-08
 * Time: 00:50
 * Description:
 */
public interface UserProfileDao
{
    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
