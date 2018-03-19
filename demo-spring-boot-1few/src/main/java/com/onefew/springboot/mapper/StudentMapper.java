package com.onefew.springboot.mapper;

import com.onefew.springboot.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by lenovo on 2018/3/8.
 */
public interface StudentMapper {

    Student getById(Integer id);

    List<Student> likeName(String name, RowBounds rb);

    String getNameById(Integer id);

}
