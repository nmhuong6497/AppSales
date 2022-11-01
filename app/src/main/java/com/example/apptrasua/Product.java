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

    public static List<Product> getMockFreezeCoffee() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.caramel_phin_freeze,"Caramel Phin Freeze",55),
                new Product(R.drawable.classic_phin_freeze,"Classic Phin Freeze",55)
        ));
    }

    public static List<Product> getMockTeaTropical() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.tra_xoai_nhiet_doi,"Trà Xoài Nhiệt Đới",55),
                new Product(R.drawable.tra_mo_so_ri,"Trà Mơ Sơ Ri",55),
                new Product(R.drawable.tra_oi_hong,"Trà Ổi Hồng",55)
        ));
    }

    public static List<Product> getMockTeaNomal() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.tra_sen_vang_cu_nang,"Trà Sen Vàng (Củ Năng)",45),
                new Product(R.drawable.tra_sen_vang_sen,"Trà Sen Vàng (Sen)",45),
                new Product(R.drawable.tra_xanh_dau_do,"Trà Xanh Đậu Đỏ",45),
                new Product(R.drawable.tra_thach_vai,"Trà Thạch Vải",45),
                new Product(R.drawable.tra_thach_dao,"Trà Thạch Đào",45),
                new Product(R.drawable.tra_thanh_dao,"Trà Thanh Đào",45)
        ));
    }

    public static List<Product> getMockPastry() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.mousse_cacao,"Bánh Mousse Cacao",35),
                new Product(R.drawable.mousse_dao,"Bánh Mousse Đào",35),
                new Product(R.drawable.socola,"Bánh Socola Highland",35),
                new Product(R.drawable.pho_mai_cafe,"Bánh Phô Mai Cà Phê",29),
                new Product(R.drawable.pho_mai_chanh_day,"Bánh Phô Mai Chanh Dây",29),
                new Product(R.drawable.pho_mai_tra_xanh,"Bánh Phô Mai Trà Xanh",35),
                new Product(R.drawable.caramel_pho_mai,"Bánh Caramel Phô Mai",35),
                new Product(R.drawable.tiramisu,"Bánh Tiramisu",35),
                new Product(R.drawable.chuoi,"Bánh Chuối",29)
        ));
    }

    public static List<Product> getMockMerchandise() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.phin_inox,"Phin Inox",79),
                new Product(R.drawable.ly_su_mosaic,"Ly Sứ Mosaic",149)
        ));
    }

    public static List<Product> getMockPackagedCoffee() {
        return new ArrayList<>(Arrays.asList(
                new Product(R.drawable.truyenthong1kg,"Truyền Thống 1kg",275),
                new Product(R.drawable.truyenthong200gr,"Truyền thống 200gr",59),
                new Product(R.drawable.sanhdieu200gr,"Sành Điệu 200gr",55),
                new Product(R.drawable.moka200gr,"Moka 200gr",85),
                new Product(R.drawable.disan200gr,"Di Sản 200gr",42),
                new Product(R.drawable.culi200gr,"Culi 200Gr",75),
                new Product(R.drawable.cafe_den_lon,"Cà Phê Đen 185ml - 6 lon",66),
                new Product(R.drawable.cafe_sua_lon,"Cà Phê Sữa 185ml - 6 lon",69),
                new Product(R.drawable.cafe_hoa_tan_50,"Cà Phê Hòa Tan -  50 gói",140),
                new Product(R.drawable.cafe_hoa_tan_20,"Cà Phê Hòa Tan - 20 gói",58)
        ));
    }
}
