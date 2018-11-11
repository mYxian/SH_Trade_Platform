package com.platform.web.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.platform.web.form.LoginForm;

@Controller
public class LoginController {
    @RequestMapping(value="login")
    public String login(HttpServletRequest request,LoginForm command ){
        String username = command.getUsername();
        request.setAttribute("username", username);
        return "/login/index";
    }
}