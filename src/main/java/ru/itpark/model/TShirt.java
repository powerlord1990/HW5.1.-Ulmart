package ru.itpark.model;

public class TShirt extends Product {
    private String color;
    private int size;
    private String manufactured;

    public TShirt(int id, String name, int price, double rating, String color, int size, String manufactured) {
        super(id, name, price, rating);
        this.color = color;
        this.size = size;
        this.manufactured = manufactured;
    }

    @Override
    public boolean match(String productType) {
        return productType.toUpperCase().equals("TSHIRT");
    }

    @Override
    public String toString() {
        return "TShirt{" +"id= "+getId()+
                " color='" + color + '\'' +
                ", size=" + size +
                ", manufactured='" + manufactured + '\'' +
                '}';
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
