package com.krsm.library.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class BookKeeping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date issueDate;
    private Date returnDate;
    private Date actualReturnDate;
    private int penalty;
    @OneToOne
    private Book book;
}
