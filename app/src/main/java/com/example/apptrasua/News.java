package com.example.apptrasua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class News {
    private int image;
    private String name;
    private String date;

    public News(int image, String name, String date) {
        this.image = image;
        this.name = name;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static List<News> getMock() {
        return new ArrayList<>(Arrays.asList(
                new News(R.drawable.banner_1, "Trà sen vàng - ô long thanh mát, sen vàng ngọt thơm", "08/10/2022"),
                new News(R.drawable.image_news_3, "Hè vui phơi phới cùng bộ 3 trà nhiệt đới", "01/07/2022"),
                new News(R.drawable.image_4, "Thông báo điều chỉnh giá", "27/06/2022"),
                new News(R.drawable.image_news_2, "Làm gì thì làm, cà phê cái đã!", "11/03/2022"),
                new News(R.drawable.image_5, "Lịch hoạt động Tết Nguyên Đán 2022", "26/01/2022"),
                new News(R.drawable.image_6, "\"Trả đi rồi tính\" cùng trà sen vàng", "21/01/2022"),
                new News(R.drawable.image_7, "Chính thức ra mắt ứng dụng di động 'mới'", "18/10/2021"),
                new News(R.drawable.image_8, "Bánh Trung Thu - sẻ chia tinh túy Đất Việt", "04/08/2021"),
                new News(R.drawable.image_9, "Lịch hoạt động Tết Nguyên Đán 2021", "05/02/2021"),
                new News(R.drawable.image_10, "Ra mắt PhinDi Hồng Trà mới", "08/12/2021")
        ));
    }
}
