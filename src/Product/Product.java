package Product;

import Brand.Brand;


public class Product {

    private int id;
    private double price;
    private double discount;
    private int stock;
    private String name;
    private int ram;
    private int storage;
    private Brand brand;
    private int screenSize;


    public Product(int id, double price, double discount, int stock, String name, int ram, int storage, Brand brand, int screenSize) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.name = name;
        this.ram = ram;
        this.storage = storage;
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
