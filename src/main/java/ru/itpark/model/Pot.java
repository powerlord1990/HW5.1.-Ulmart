package ru.itpark.model;

public class Pot extends Product {
    private String color;
    private String manufactured;

    public Pot(int id, String name, int price, double rating, String color, String manufactured) {
        super(id, name, price, rating);
        this.color = color;
        this.manufactured = manufactured;
    }

    @Override
    public boolean match(String productType) {
        return productType.toUpperCase().equals("POT");
    }

    @Override
    public String toString() {
        return "Pot{" + super.toString() +
                " color='" + color + '\'' +
                ", manufactured='" + manufactured + '\'' +
                '}';
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