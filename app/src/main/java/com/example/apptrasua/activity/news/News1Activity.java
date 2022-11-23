package com.example.apptrasua.activity.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apptrasua.R;

public class News1Activity extends AppCompatActivity {

    TextView tvTitle, tvDate, tvContent;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        tvTitle = findViewById(R.id.text_view_news_title);
        tvDate = findViewById(R.id.text_view_news_date);
        tvContent = findViewById(R.id.text_view_news_content);
        img = findViewById(R.id.image_view_news);

        tvTitle.setText("TRÀ SEN VÀNG - Ô LONG THANH MÁT, SEN VÀNG NGỌT THƠM");
        tvDate.setText("Thứ bảy, 08/10/2022, 16:30 GMT+7");
        img.setImageResource(R.drawable.banner_1);
        tvContent.setText("Trà Sen Vàng - tựa như người bạn, người đồng hành không hề thiếu trong những câu chuyện, sự kiện, buổi đàm tiếu xôm tụ nhất của chúng ta tại Highlands Coffee.\n" +
                "\n" +
                "Với mùi vị nổi tiếng của trà Ô Long Thanh Mát, topping hạt sen ngọt bùi hay thạch củ năng giòn giã. Tất cả đều khiến ta si mê, chìm đắm trong sự hòa quyện từ thức uống đình đám, độc đáo này tại Highlands Coffee.\n" +
                "\n" +
                "\uD83D\uDE0D Nhanh chân kiểm chứng mùi vị độc đáo này tại quán Highlands Coffee sát bên nhà bạn, chọn ngay size Trà Sen Vàng ưng ý, xử lý mọi chuyện ắt đều vừa ý!");
    }
}