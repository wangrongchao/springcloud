package com.winnerchen.mapper;

import com.winnerchen.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by lenovo on 2018/1/27.
 */
@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM T_student WHERE PHONE = #{phone}")
    Student findUserByPhone(@Param("phone") String phone);

    @Insert("INSERT INTO T_student(NAME, PASSWORD, PHONE) VALUES(#{name}, #{password}, #{phone})")
    int insert(@Param("name") String name, @Param("password") String password, @Param("phone") String phone);
}
