package com.onefew.springboot.mapper;

import com.onefew.springboot.domain.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by lenovo on 2018/3/8.
 */
@Mapper
public interface UserDao {
    @Select("SELECT * FROM user where id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "user_name"),
            @Result(property = "password", column = "age")
    })
    User findById(@Param("id") int id);
}
