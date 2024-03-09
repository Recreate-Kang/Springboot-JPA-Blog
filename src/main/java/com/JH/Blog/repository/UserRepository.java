package com.JH.Blog.repository;

import com.JH.Blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository 생략가능
public interface UserRepository extends JpaRepository<User,Integer> {
}
