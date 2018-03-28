package com.huikao.demo.service;

/**
 * Created by admin on 2018/3/1.
 */
public interface UserService {

    /**
     * 新增一个用户
     * @param name
     * @param age
     */
    void create(Integer id, String name, String sex, String birthday, String age);

    /**
     * 根据name删除一个用户
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     * @return
     */
    Integer getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();
}
