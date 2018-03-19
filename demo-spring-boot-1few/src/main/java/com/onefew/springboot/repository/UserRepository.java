package com.onefew.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by lenovo on 2018/1/26.
 */
public interface UserRepository extends JpaRepository<User2, Long> {
        User2 findByUserName(String userName);

        @Query(value="select u.* from t_user u where u.id=?1", nativeQuery = true)
        User2 findById(Integer id);

        User2 findByUserNameOrEmail(String username, String email);

      // @Query(value="select u.* from  user u where u.user_name = ?1",nativeQuery = true)
      @Query(value="select u from  User2 u where u.userName = ?1")
        List<User2> findAll2(String userName);

}
