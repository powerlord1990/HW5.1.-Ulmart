package ru.itpark.model;

public class TV extends Product {
    private String manufactured;
    private int screenSize;
    private boolean smart;
    private String color;

    public TV(int id, String name, int price, double rating, String manufactured, int screenSize, boolean smart, String color) {
        super(id, name, price, rating);
        this.manufactured = manufactured;
        this.screenSize = screenSize;
        this.smart = smart;
        this.color = color;
    }

    @Override
    public boolean match(String productType) {
        return productType.toUpperCase().equals("TV");
    }

    @Override
    public String toString() {
        return "TV{" + super.toString() +
                "' manufactured='" + manufactured + '\'' +
                ", screenSize=" + screenSize +
                ", smart=" + smart +
                ", color='" + color + '\'' +
                '}';
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}