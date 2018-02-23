package com.huikao.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 2018/2/23.
 */
public interface UserRepository extends JpaRepository<UserInfo, Integer> {

    UserInfo findByName(String name);

    UserInfo findByNameAndAge(String name, Integer age);

//    @Query("from UserInfo u where u.name=:name")
//    UserInfo findUser(@Param("name") String name);
}
