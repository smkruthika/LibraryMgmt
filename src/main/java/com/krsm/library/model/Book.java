package com.krsm.library.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long isbn;
    private String title;
    private String publisher;
    @OneToOne
    private Category category;
    @OneToOne
    private Copies copies;
    @OneToOne
    private BookKeeping bookKeeping;
    @ManyToMany
    @JoinTable(name = "book_users",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "user.id"))
    private Set<User> user;
}
