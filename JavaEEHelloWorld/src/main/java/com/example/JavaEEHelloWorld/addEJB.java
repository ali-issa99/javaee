package com.example.JavaEEHelloWorld;

import javax.ejb.Stateless;

@Stateless
public class addEJB {
    private int i,k,j;

    public int getI() {
        return i;
    }

    public int getK() {
        return k;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void add() {

        k=i+j;
    }
}





