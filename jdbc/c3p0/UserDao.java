package com.rj.spring.jdbc.c3p0;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDao extends JdbcDaoSupport {

    public void update(){
        this.getJdbcTemplate().update("insert into t_user(username,password) values(?,?);", "tom", "998");
        //
    }
}
