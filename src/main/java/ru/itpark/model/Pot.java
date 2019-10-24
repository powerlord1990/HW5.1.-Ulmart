package ru.itpark.model;

public class Pot extends Product {
    private String color;
    private String manufactured;

    public Pot(long id, String name, int price, String color, String manufactured) {
        super(id, name, price);
        this.color = color;
        this.manufactured = manufactured;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }
}
