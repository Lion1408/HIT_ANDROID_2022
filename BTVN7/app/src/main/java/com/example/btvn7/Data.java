package com.example.btvn7;

public class Data {
    String  nd;
    Integer id;
    public Data(Integer id, String nd) {
        this.id = id;
        this.nd = nd;
    }

    public Data() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }
}
