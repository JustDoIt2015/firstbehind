package com.first.behind.component.login.mapper;

import com.first.behind.component.login.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from t_user")
    List<UserModel> getUsers();

    @Select("select * from t_user where username = ${username}")
    UserModel findUser(String username);
}
