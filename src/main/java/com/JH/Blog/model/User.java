package com.JH.Blog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import java.sql.Timestamp;

@Entity//유저클래스가 mysql에 테이블이 생성 됨
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@DynamicInsert 인서트시 null값을 기본값으로 입력
public class User {

    @Id//primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//프로젝트의 DB 넘버링 전략을 따른다
    private int id; //시퀀스, auto_increment
    @Column(nullable=false, length = 30)
    private String username;
    @Column(nullable = false,length = 100)//해쉬 암호화
    private String password;
    @Column(nullable = false, length = 50)
    private String email;
    //@ColumnDefault("'user'")
    @Enumerated(EnumType.STRING)
    private RoleType role; //Enum을 쓰는게 좋다.//Admin,user,manager
    @CreationTimestamp//시간이 자동으로 입력
    private Timestamp createDate;


}
