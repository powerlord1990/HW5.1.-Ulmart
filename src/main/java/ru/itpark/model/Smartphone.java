package ru.itpark.model;


public class Smartphone extends Product {
    private String color;
    private String manufactured;
    private String operatingSystem;
    private int ram;
    private String processor;

    public Smartphone(long id, String name, int price, String color, String manufactured, String operatingSystem, int ram, String processor) {
        super(id, name, price);
        this.color = color;
        this.manufactured = manufactured;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.processor = processor;
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
                ", processor='" + processor + '\'' +
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

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
