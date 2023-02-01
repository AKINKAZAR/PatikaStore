package Product;

import Brand.Brand;

public class SmartPhone extends Product{
    private int battery;
    private String color;

    public SmartPhone(int id, double price, double discount, int stock, String name, int ram, int storage, Brand brand, int screenSize, int battery, String color) {
        super(id, price, discount, stock, name, ram, storage, brand, screenSize);
        this.battery = battery;
        this.color = color;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
