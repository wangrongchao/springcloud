package com.onefew.springboot.controller;

import com.onefew.springboot.domain.Student;
import com.onefew.springboot.domain.User;
import com.onefew.springboot.mapper.StudentMapper;
import com.onefew.springboot.repository.UserRepository;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on 2018/3/8.
 */
@RestController
@RequestMapping("city/")
public class CityController {
    @Autowired
    StudentMapper studentMapper;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World,snow is beautifull";
    }

    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setName("test");
        return user;
    }

    @RequestMapping("getStudent/{id}")
    public Student getStu(@PathVariable(value = "id") int id) {
        Student stu = studentMapper.getById(id);
        return stu;
    }

    @RequestMapping("getStudentByName/{name}")
    public Student getStu(@PathVariable(value = "name") String name) {
        RowBounds rb = new RowBounds(0,2);
        List<Student> stu = studentMapper.likeName(name,rb);
        return stu != null ? stu.get(0) : null;
    }

    @RequestMapping("/{id}/getUserbyName")
    public String index(HttpServletRequest req, @PathVariable("id") String id) {
        String name = req.getParameter("name");
        //com.onefew.springboot.repository.User2 u = userRepository.findByUserName(name);
        com.onefew.springboot.repository.User2 u = userRepository.findById(Integer.parseInt(id));
        List<com.onefew.springboot.repository.User2> u2 = userRepository.findAll2("tom");
        name = u.getUserName();
        return "Hello "+name+"World,snow is beautifull";
    }
}
