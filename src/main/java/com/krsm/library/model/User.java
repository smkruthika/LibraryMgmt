package com.krsm.library.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String address;
//    @ManyToMany(mappedBy = "user")
//    private Set<Book> book;
//    @OneToOne
//    private Role role;
//    @ManyToMany
//    @JoinTable(name = "user_bookKeepings",
//        joinColumns = @JoinColumn(name = "bookKeeping_id"),
//        inverseJoinColumns = @JoinColumn(name = "user_id"))
//    private Set<BookKeeping> bookKeeping;
}
