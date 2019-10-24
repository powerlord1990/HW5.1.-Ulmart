package ru.itpark.model;

public class TShirt extends Product {
    private String color;
    private int size;
    private String manufactured;

    public TShirt(long id, String name, int price, String color, int size, String manufactured) {
        super(id, name, price);
        this.color = color;
        this.size = size;
        this.manufactured = manufactured;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }
}
