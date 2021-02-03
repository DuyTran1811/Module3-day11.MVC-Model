package com.managerSmatphone.controller.model;

public class SmartPhone {
    private int id;
    private String brand;
    private String name;
    private float price;
    private String yearProduct;
    private String sizeScreen;

    public SmartPhone() {
    }

    public SmartPhone(int id, String brand, String name, float price, String yearProduct, String sizeScreen) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.yearProduct = yearProduct;
        this.sizeScreen = sizeScreen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getYearProduct() {
        return yearProduct;
    }

    public void setYearProduct(String yearProduct) {
        this.yearProduct = yearProduct;
    }

    public String getSizeScreen() {
        return sizeScreen;
    }

    public void setSizeScreen(String sizeScreen) {
        this.sizeScreen = sizeScreen;
    }
}
