package com.huikao.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by admin on 2018/2/23.
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

    UserInfo findByName(String name);

    UserInfo findByNameAndAge(String name, Integer age);

    @Query(value = "select u from UserInfo u where u.name = :name")
    UserInfo findUserInfo(@Param("name") String name);

}
