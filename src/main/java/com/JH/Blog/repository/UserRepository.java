package com.JH.Blog.repository;

import com.JH.Blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//@Repository 생략가능
public interface UserRepository extends JpaRepository<User,Integer> {

}


//JPA Naming 전략
//Select*From user Where username=?1 And passwor = ?2;
//User findByUsernameAndPassword(String username, String password);
//@Query("value=Select*From user Where username=?1 And passwor = ?2",navtive = true)
//User login(String username, String password)