package com.ahao.forum.guitar.manager.profile.service;

import com.ahao.commons.entity.IDataSet;

import java.util.List;

public interface ProfileService {
    boolean saveProfile(Long userId, String avatarUrl, String email, Integer sex, String qq, String city);


    IDataSet getProfile(Long userId);
    List<IDataSet> getSelectedRole(Long userId);
    List<IDataSet> getSelectedAuth(Long userId);

}
