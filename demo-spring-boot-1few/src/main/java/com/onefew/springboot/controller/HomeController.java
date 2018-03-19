package com.onefew.springboot.controller;

import com.onefew.springboot.domain.User;
import com.onefew.springboot.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lenovo on 2018/3/8.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    UserDao userDao;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name","world");
        return "home";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable(value = "id") int id){
        User u = userDao.findById(id);
        model.addAttribute("name",u.getName());
        return "home";
    }
}
