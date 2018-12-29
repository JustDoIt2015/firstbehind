package com.first.behind.component.login.controller;

import com.first.behind.component.api.RestResult;
import com.first.behind.component.api.ResultGenerator;
import com.first.behind.component.login.model.RoleModel;
import com.first.behind.component.login.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    @RequestMapping("/getuser/{id}")
    @ResponseBody
    public UserModel getUserById(@PathVariable int id) {
        UserModel userModel = new UserModel();
        userModel.setUsername("abc");
        userModel.setUsername("123345");
        userModel.setId(id);
        RoleModel roleModel = new RoleModel();
        roleModel.setId(1);
        roleModel.setName("role");
        List<RoleModel> roleModels = new ArrayList<>();
        roleModels.add(roleModel);
        userModel.setRoles(roleModels);
        return userModel;
    }

    @RequestMapping("/login")
    @ResponseBody
    public RestResult apilogin() {
        UserModel userModel = new UserModel();
        userModel.setUsername("abc");
        userModel.setPassword("123345");
        userModel.setId(1);
        RoleModel roleModel = new RoleModel();
        roleModel.setId(1);
        roleModel.setName("role");
        List<RoleModel> roleModels = new ArrayList<>();
        roleModels.add(roleModel);
        userModel.setRoles(roleModels);
        return new ResultGenerator().getSuccessResult(userModel);
    }
}
