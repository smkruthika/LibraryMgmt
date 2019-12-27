package com.krsm.library.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Copies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int noOfCopyCurrent;
    private int noOfCopyActual;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNoOfCopyCurrent() {
        return noOfCopyCurrent;
    }

    public void setNoOfCopyCurrent(int noOfCopyCurrent) {
        this.noOfCopyCurrent = noOfCopyCurrent;
    }

    public int getNoOfCopyActual() {
        return noOfCopyActual;
    }

    public void setNoOfCopyActual(int noOfCopyActual) {
        this.noOfCopyActual = noOfCopyActual;
    }
}
