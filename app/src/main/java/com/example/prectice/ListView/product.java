package com.example.prectice.ListView;

public class product {

    private String name;
    private Integer price;

    public product(String name, Integer price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "product name:"+name+"\nprice:"+price;
    }
}
