package com.websystique.springmvc.service;

import com.websystique.springmvc.model.UserProfile;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-09-08
 * Time: 00:59
 * Description:
 */
public interface UserProfileService
{
    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();
}
