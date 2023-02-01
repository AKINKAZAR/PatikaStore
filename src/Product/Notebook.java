package Product;

import Brand.Brand;

public class Notebook extends Product{
    public Notebook(int id, double price, double discount, int stock, String name, int ram, int storage, Brand brand, int screenSize) {
        super(id, price, discount, stock, name, ram, storage, brand, screenSize);
    }


}
