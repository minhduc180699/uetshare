package com.example.uetshare.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Document extends Base {
    @Column
    private String subject;
    @Column
    private String content;
    @Column
    private String author;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id",nullable = false)
    private Account account;
}
