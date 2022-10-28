package com.example.apptrasua.feeze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apptrasua.R;
import com.example.apptrasua.feeze.menu.MenuFreezeNoCoffeeActivity;

public class FreezeActivity extends AppCompatActivity {

    TextView tvTitleNoCoffee, tvContentNoCoffe, tvTitleCoffee, tvContentCoffee;
    ImageView imgNoCoffe, imgCoffee;
    Button btnNoCoffee, btnCoffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        tvTitleNoCoffee = findViewById(R.id.text_view_title_1);
        tvTitleCoffee = findViewById(R.id.text_view_title_2);
        tvContentNoCoffe = findViewById(R.id.text_view_content_1);
        tvContentCoffee = findViewById(R.id.text_view_content_2);
        imgNoCoffe = findViewById(R.id.image_view_1);
        imgCoffee = findViewById(R.id.image_view_2);
        btnNoCoffee = findViewById(R.id.button_1);
        btnCoffee = findViewById(R.id.button_2);

        tvTitleNoCoffee.setText("FREEZE KHÔNG CÀ PHÊ");
        imgNoCoffe.setImageResource(R.drawable.image_freezee_no_coffee);
        tvContentNoCoffe.setText("Nếu bạn là người yêu thích những gì mới mẻ và sành điệu để khơi nguồn cảm hứng. Hãy thưởng thức ngay các món nước đá xay độc đáo mang hương vị tự nhiên tại Highlands Coffee để đánh thức mọi giác quan của bạn, giúp bạn luôn căng tràn sức sống.");
        tvTitleNoCoffee.setVisibility(View.VISIBLE);
        imgNoCoffe.setVisibility(View.VISIBLE);
        tvContentNoCoffe.setVisibility(View.VISIBLE);
        btnNoCoffee.setVisibility(View.VISIBLE);

        tvTitleCoffee.setText("FREEZE CÀ PHÊ PHIN");
        imgCoffee.setImageResource(R.drawable.image_freeze_coffe);
        tvContentCoffee.setText("Cà phê đá xay theo phong cách của người Việt! Dòng sản phẩm đá xay mát lạnh được pha chế từ cà phê Phin đậm đà, hòa quyện cùng thạch dai giòn sần sật cùng nhiều hương vị hấp dẫn khác.");
        tvTitleCoffee.setVisibility(View.VISIBLE);
        imgCoffee.setVisibility(View.VISIBLE);
        tvContentCoffee.setVisibility(View.VISIBLE);
        btnCoffee.setVisibility(View.VISIBLE);

        btnNoCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FreezeActivity.this, MenuFreezeNoCoffeeActivity.class);
                startActivity(intent);
            }
        });
    }
}