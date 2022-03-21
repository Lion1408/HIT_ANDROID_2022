package com.example.btvn5;

public class Data {
    private Integer pic;
    private String name, sect, price;

    public Data() {
    }

    public Data(Integer pic, String name, String sect, String price) {
        this.pic = pic;
        this.name = name;
        this.sect = sect;
        this.price = price;
    }

    public Integer getPic() {
        return pic;
    }

    public void setPic(Integer pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSect() {
        return sect;
    }

    public void setSect(String sect) {
        this.sect = sect;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
