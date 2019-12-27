package com.krsm.library.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Copies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int noOfCopyCurrent;
    private int noOfCopyActual;
    @OneToOne
    private Book book;
}
