package ru.itpark.model;


public class Smartphone extends Product {
    private String color;
    private String manufactured;
    private String operatingSystem;
    private int ram;


    public Smartphone(int id, String name, int price, double rating, String color, String manufactured, String operatingSystem, int ram) {
        super(id, name, price, rating);
        this.color = color;
        this.manufactured = manufactured;
        this.operatingSystem = operatingSystem;
        this.ram = ram;

    }

    @Override
    public boolean match(String productType) {
        return productType.toUpperCase().equals("SMARTPHONE");
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "color='" + color + '\'' +
                ", manufactured='" + manufactured + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", ram=" + ram +
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

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}
