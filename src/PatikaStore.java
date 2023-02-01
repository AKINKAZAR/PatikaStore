import Brand.*;
import Product.Notebook;
import Product.Product;
import Product.SmartPhone;

import java.util.*;

public class PatikaStore {

    Scanner input = new Scanner(System.in);

    public void run() {


        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış Yap");

        System.out.print("Tercihiniz: ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                listNotebook();
                break;
            case 2:
                listSmartPhone();
                break;
            case 3:
                listBrand();
                break;
            default:
                System.out.println("Çıkış Yapıldı");
        }

    }

    private void listBrand() {
        Brand samsung = new Samung();
        Brand huawei = new Huawei();
        Brand apple = new Apple();
        Brand casper = new Casper();
        Brand asus = new Asus();
        List<Brand> brands = Arrays.asList(samsung, huawei, apple, casper, asus);

        Iterator<Brand> itr = brands.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().getName());
        }
        System.out.println("--------------------------------------");
        run();
    }

    private void listSmartPhone() {
        ArrayList<Product> list = new ArrayList<>();
        list.addAll(createSmartPhones());
        System.out.println("Notebook Listesi");

        String format = "| %-5s | %-20s | %-15s | %-10s | %-10s | \n";
        System.out.println("----------------------------------------------------------------------------");
        System.out.format(format, "ID", "Name", "Price", "Ekran", "Ram");

        for (Product arr : list) {
            System.out.format(format, arr.getId(), arr.getName(), arr.getPrice(), arr.getScreenSize(), arr.getRam());
        }
        boolean isSelect = false;
        while (!isSelect) {
            System.out.println("Üst Menü için 0 Tuşlayın");
            int select = input.nextInt();
            if (select == 0) {
                run();
                break;
            }
        }
    }

    private List<Product> createSmartPhones() {
        Brand brandSamsung = new Samung();
        Brand brandHuawei = new Huawei();
        Brand brandApple = new Apple();

        Product samsung = new SmartPhone(1, 1200, 15, 6, "Galaxy S22", 8, 12, brandSamsung, 12, 1000, "Kırmızı");
        Product huawei = new SmartPhone(1, 1200, 15, 6, "Galaxy S22", 8, 12, brandHuawei, 12, 1000, "Kırmızı");
        Product apple = new SmartPhone(1, 1200, 15, 6, "Galaxy S22", 8, 12, brandApple, 12, 1000, "Kırmızı");
        List<Product> smartPhones = Arrays.asList(samsung, huawei, apple);


        return smartPhones;
    }

    private List<Notebook> createNotebooks() {
        Brand brandSamsung = new Samung();
        Brand brandHuawei = new Huawei();
        Brand brandApple = new Apple();


        Notebook samsung = new Notebook(1, 1500, 15, 5, "Galaxy M23", 8, 512, brandSamsung, 12);
        Notebook apple = new Notebook(2, 1900, 15, 5, "Galaxy M23", 8, 512, brandHuawei, 12);
        Notebook huawei = new Notebook(3, 2100, 15, 5, "Huawei Note", 4, 32, brandApple, 10);
        List<Notebook> notebooks = Arrays.asList(samsung, apple, huawei);
        return notebooks;
    }

    private void listNotebook() {
        ArrayList<Notebook> list = new ArrayList<>();
        list.addAll(createNotebooks());
        System.out.println("Notebook Listesi");

        String format = "| %-5s | %-20s | %-15s | %-10s | %-10s | \n";
        System.out.println("----------------------------------------------------------------------------");
        System.out.format(format, "ID", "Name", "Price", "Ekran", "Ram");

        for (Notebook arr : list) {
            System.out.format(format, arr.getId(), arr.getName(), arr.getPrice(), arr.getScreenSize(), arr.getRam());
        }
        boolean isSelect = false;
        while (!isSelect) {
            System.out.println("Üst Menü için 0 Tuşlayın");
            int select = input.nextInt();
            if (select == 0) {
                run();
                break;
            }
        }
    }
}
