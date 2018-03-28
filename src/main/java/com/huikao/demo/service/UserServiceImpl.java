package com.huikao.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/3/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Integer id, String name, String sex, String birthday, String age) {
        jdbcTemplate.update(
                "INSERT INTO user_info (id, name, sex, birthday, age) VALUES (?, ?, ?, ?, ?)",
                id,
                name,
                sex,
                birthday,
                age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("DELETE FROM user_info WHERE name = ?", name);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("SELECT count(1) FROM user_info", Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("DELETE FROM user_info");
    }
}
