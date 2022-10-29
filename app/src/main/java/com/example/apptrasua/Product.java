package com.example.apptrasua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {
    private int image;
    private String name;
    private int price;

    public Product(int image, String name, int price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static List<Product> getMockCoffeePhin() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.phin_sua_da, "Phin Sữa Đá", 35),
                new Product(R.drawable.phin_den_da, "Phin Đen Đá", 35),
                new Product(R.drawable.phin_sua_nong, "Phin Sữa Nóng", 35),
                new Product(R.drawable.phin_den_nong, "Phin Đen Nóng", 35),
                new Product(R.drawable.bac_xiu_da, "Bạc Xỉu Đá", 35)
                ));
    }

    public static List<Product> getMockCoffeePhinDi() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.phindi_choco,"PhinDi Choco",45),
                new Product(R.drawable.phindi_hanhnhan,"PhinDi Hạnh Nhân",45),
                new Product(R.drawable.phindi_kemsua,"PhinDi Kem Sữa",45)
        ));
    }

    public static List<Product> getMockCoffeeEspresso() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.espresso, "Espresso", 45),
                new Product(R.drawable.americano, "Americano", 45),
                new Product(R.drawable.latte, "Latte", 65),
                new Product(R.drawable.cappucino, "Cappucino", 65),
                new Product(R.drawable.caramel_macchiato, "Caramel Macchiato", 69),
                new Product(R.drawable.mocha_macchiato, "Mocha Macchiato", 69)
        ));
    }

    public static List<Product> getMockFreezeNoCoffee() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.freezee_tra_xanh,"Freezee Trà Xanh",55),
                new Product(R.drawable.cookies_cream,"Cookies & Cream",55),
                new Product(R.drawable.freeze_socola,"Freeze Socola",55)
        ));
    }
}
