package com.springboot.repository;

import com.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by lenovo on 2018/1/26.
 */
public interface UserRepository extends JpaRepository<User, Long> {
        User findByUserName(String userName);
        User findByUserNameOrEmail(String username, String email);

        @Query("select u from User u where u.id = ?1")
        User findById(String id);

}
