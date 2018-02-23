package com.huikao.demo.service;

import com.huikao.demo.domain.UserInfo;

/**
 * Created by admin on 2018/2/23.
 */
public interface UserService {

    void add(UserInfo userInfo);

    void delete(String userName);

    UserInfo getUserInfo(String userName);
}
