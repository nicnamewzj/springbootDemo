package com.winterchen.service.user;

import com.winterchen.model.UserDomain;

import java.util.List;

/**
 * Created by Administrator on 2018/4/19.
 * 
 * tom is cat
 */
public interface UserService {

    int addUser(UserDomain user);

    List<UserDomain> findAllUser(int pageNum, int pageSize);
}
