package com.hong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Cai on 2015/6/11 14:37.
 */
@Controller
public class SessionController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String name, String pass, HttpServletRequest request) {
        request.getSession().setAttribute("name", name);
        request.getSession().setAttribute("pass", pass);

        return "login";
    }

    @RequestMapping(value = "/getUsername", method = RequestMethod.GET)
    public String getUsername() {
        return "username";
    }
}
