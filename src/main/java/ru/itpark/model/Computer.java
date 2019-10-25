package ru.itpark.model;

public class Computer extends Product {
    private String processor;
    private String videocart;
    private int hdd;

    public Computer(int id, String name, int price, double rating, String processor, String videocart, int hdd) {
        super(id, name, price, rating);
        this.processor = processor;
        this.videocart = videocart;
        this.hdd = hdd;
    }

    @Override
    public boolean match(String productType) {
        return productType.toUpperCase().equals("COMPUTER");
    }

    @Override
    public String toString() {
        return "Computer{" +"id= "+getId()+
                " processor='" + processor + '\'' +
                ", videocart='" + videocart + '\'' +
                ", hdd=" + hdd +
                '}';
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getVideocart() {
        return videocart;
    }

    public void setVideocart(String videocart) {
        this.videocart = videocart;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
}