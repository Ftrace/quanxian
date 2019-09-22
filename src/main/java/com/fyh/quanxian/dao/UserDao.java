package com.fyh.quanxian.dao;

import com.fyh.quanxian.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from User where User.username = #{username}")
    User getUser(String username);
}
