package com.springboot.controller;

import com.springboot.model.User;
import com.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2018/1/26.
 */
@RestController
public class HelloWorldController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World,snow is beautifull";
    }

    @RequestMapping("/{id}/getUserbyName")
    public String index(HttpServletRequest req,@PathVariable("id") String id) {
        String name = req.getParameter("name");
        User u = userRepository.findByUserName(name);
        name = id;
        return "Hello "+name+"World,snow is beautifull";
    }
}
