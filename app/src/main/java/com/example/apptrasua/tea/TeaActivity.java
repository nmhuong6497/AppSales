package com.example.apptrasua.tea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apptrasua.R;

public class TeaActivity extends AppCompatActivity {

    TextView tvTitleTeaTropical, tvContentTeaTropical, tvTitleTea, tvContentTea;
    ImageView imgTeaTropical, imgTea;
    Button btnTeaTropical, btnTea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        tvTitleTeaTropical = findViewById(R.id.text_view_title_1);
        tvTitleTea = findViewById(R.id.text_view_title_2);
        tvContentTeaTropical = findViewById(R.id.text_view_content_1);
        tvContentTea = findViewById(R.id.text_view_content_2);
        imgTeaTropical = findViewById(R.id.image_view_1);
        imgTea = findViewById(R.id.image_view_2);
        btnTeaTropical = findViewById(R.id.button_1);
        btnTea = findViewById(R.id.button_2);

        tvTitleTeaTropical.setText("TRÀ NHIỆT ĐỚI");
        imgTeaTropical.setImageResource(R.drawable.image_tea_tropical);
        tvContentTeaTropical.setText("Vị trà thanh mát, mùi trái cây ngọt ngào trên đầu lưỡi, chất dai dai của boba caramel hòa quyện vào nhau tạo nên những cảm giác vô cùng tuyệt vời! Đảm bảo giải nhiệt ngay mùa hè, KHUẤY ĐẢO NGÀY VUI, XOÁY BAY BUỒN CHÁN!");
        tvTitleTeaTropical.setVisibility(View.VISIBLE);
        imgTeaTropical.setVisibility(View.VISIBLE);
        tvContentTeaTropical.setVisibility(View.VISIBLE);
        btnTeaTropical.setVisibility(View.VISIBLE);

        tvTitleTea.setText("TRÀ");
        imgTea.setImageResource(R.drawable.image_tea);
        tvContentTea.setText("Hương vị tự nhiên, thơm ngon của Trà Việt với phong cách hiện đại tại Highlands Coffee sẽ giúp bạn gợi mở vị giác của bản thân và tận hưởng một cảm giác thật khoan khoái, tươi mới.");
        tvTitleTea.setVisibility(View.VISIBLE);
        imgTea.setVisibility(View.VISIBLE);
        tvContentTea.setVisibility(View.VISIBLE);
        btnTea.setVisibility(View.VISIBLE);
    }
}