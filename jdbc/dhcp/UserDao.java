package com.rj.spring.jdbc.dhcp;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void update(){
        jdbcTemplate.update("insert into t_user(username,password) values(?,?);", "tom", "998");
        //
    }
}
