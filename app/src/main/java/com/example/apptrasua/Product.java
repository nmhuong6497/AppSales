package com.example.apptrasua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {
    private int image;
    private String name;
    private String price;

    public Product(int image, String name, String price) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static List<Product> getMockCoffeePhin() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.phin_sua_da, "Phin Sữa Đá", "35.000đ"),
                new Product(R.drawable.phin_den_da, "Phin Đen Đá", "35.000đ"),
                new Product(R.drawable.phin_sua_nong, "Phin Sữa Nóng", "35.000đ"),
                new Product(R.drawable.phin_den_nong, "Phin Đen Nóng", "35.000đ"),
                new Product(R.drawable.bac_xiu_da, "Bạc Xỉu Đá", "35.000đ")
                ));
    }

    public static List<Product> getMockCoffeePhinDi() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.phindi_choco,"PhinDi Choco","45.000đ"),
                new Product(R.drawable.phindi_hanhnhan,"PhinDi Hạnh Nhân","45.000đ"),
                new Product(R.drawable.phindi_kemsua,"PhinDi Kem Sữa","45.000đ")
        ));
    }

    public static List<Product> getMockCoffeeEspresso() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.espresso, "Espresso", "45.000đ"),
                new Product(R.drawable.americano, "Americano", "45.000đ"),
                new Product(R.drawable.latte, "Latte", "65.000đ"),
                new Product(R.drawable.cappucino, "Cappucino", "65.000đ"),
                new Product(R.drawable.caramel_macchiato, "Caramel Macchiato", "69.000đ"),
                new Product(R.drawable.mocha_macchiato, "Mocha Macchiato", "69.000đ")
        ));
    }

    public static List<Product> getMockFreezeNoCoffee() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.freezee_tra_xanh,"Freezee Trà Xanh","55.000đ"),
                new Product(R.drawable.cookies_cream,"Cookies & Cream","55.000đ"),
                new Product(R.drawable.freeze_socola,"Freeze Socola","55.000đ")
        ));
    }
}
