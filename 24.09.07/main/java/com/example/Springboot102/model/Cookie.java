package com.example.Springboot102.model;

public class Cookie {
    private String name;
    private Integer price;
    private Integer kcal;

    public Cookie(String name, Integer price, Integer kcal) {
        this.name = name;
        this.price = price;
        this.kcal = kcal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getKcal() {
        return kcal;
    }

    public void setKcal(Integer kcal) {
        this.kcal = kcal;
    }
}
