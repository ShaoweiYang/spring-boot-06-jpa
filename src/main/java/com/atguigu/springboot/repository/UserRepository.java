package com.atguigu.springboot.repository;

import com.atguigu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Shawn.Yang
 * @create 2020-05-17-21:46
 */
//继承JpaRepository 来完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {
}
