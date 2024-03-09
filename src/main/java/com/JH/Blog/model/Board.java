package com.JH.Blog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//Auto_incre
    private int id;

    @Column(nullable=false, length=100)
    private String title;

    @Lob
    private String content;//섬머노트 라이브러리 html 태그와 디자인됨

    @ColumnDefault("0")
    private int count; //조회수

    @ManyToOne // Many=Board, User = One
    @JoinColumn(name="userId")
    private User user;

    @OneToMany(mappedBy="board",fetch=FetchType.EAGER)
    private List<Reply> reply;

    @CreationTimestamp
    private Timestamp createDate;
}
