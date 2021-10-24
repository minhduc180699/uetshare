package com.example.uetshare.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Question extends Base{
    @Column
    private String content;
    @Column
    private String image;
    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;
    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Comment> comment;
}
