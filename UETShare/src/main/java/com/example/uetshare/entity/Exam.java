package com.example.uetshare.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Exam extends Base {
    @Column
    private String examName;
    @Column
    private String subject;
    @Column
    private String content;
    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;
}
