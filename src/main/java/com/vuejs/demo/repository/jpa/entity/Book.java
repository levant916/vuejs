package com.vuejs.demo.repository.jpa.entity;



import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "pageNember")
    private int pageNember;

    @Column(name = "author")
    private String author;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPageNember() {
        return pageNember;
    }

    public void setPageNember(int pageNember) {
        this.pageNember = pageNember;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}