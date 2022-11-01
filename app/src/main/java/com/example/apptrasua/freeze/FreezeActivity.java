package com.example.apptrasua.freeze;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.apptrasua.freeze.menu.MenuFreezeCoffeeActivity;
import com.example.apptrasua.freeze.menu.MenuFreezeNoCoffeeActivity;
import com.example.apptrasua.R;

public class FreezeActivity extends AppCompatActivity {

    TextView tvTitleFreezeNoCoffee, tvContentFreezeNoCoffee, tvTitleFreezeCoffee, tvContentFreezeCoffee;
    ImageView imgFreezeNoCoffee, imgFreezeCoffee;
    Button btnFreezeNoCoffee, btnFreezeCoffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        tvTitleFreezeNoCoffee = findViewById(R.id.text_view_title_1);
        tvTitleFreezeCoffee = findViewById(R.id.text_view_title_2);
        tvContentFreezeNoCoffee = findViewById(R.id.text_view_content_1);
        tvContentFreezeCoffee = findViewById(R.id.text_view_content_2);
        imgFreezeNoCoffee = findViewById(R.id.image_view_1);
        imgFreezeCoffee = findViewById(R.id.image_view_2);
        btnFreezeNoCoffee = findViewById(R.id.button_1);
        btnFreezeCoffee = findViewById(R.id.button_2);

        // Set View
        tvTitleFreezeNoCoffee.setText("FREEZE KHÔNG CÀ PHÊ");
        imgFreezeNoCoffee.setImageResource(R.drawable.image_freezee_no_coffee);
        tvContentFreezeNoCoffee.setText("Nếu bạn là người yêu thích những gì mới mẻ và sành điệu để khơi nguồn cảm hứng. Hãy thưởng thức ngay các món nước đá xay độc đáo mang hương vị tự nhiên tại Highlands Coffee để đánh thức mọi giác quan của bạn, giúp bạn luôn căng tràn sức sống.");
        tvTitleFreezeNoCoffee.setVisibility(View.VISIBLE);
        imgFreezeNoCoffee.setVisibility(View.VISIBLE);
        tvContentFreezeNoCoffee.setVisibility(View.VISIBLE);
        btnFreezeNoCoffee.setVisibility(View.VISIBLE);

        tvTitleFreezeCoffee.setText("FREEZE CÀ PHÊ PHIN");
        imgFreezeCoffee.setImageResource(R.drawable.image_freeze_coffee);
        tvContentFreezeCoffee.setText("Cà phê đá xay theo phong cách của người Việt! Dòng sản phẩm đá xay mát lạnh được pha chế từ cà phê Phin đậm đà, hòa quyện cùng thạch dai giòn sần sật cùng nhiều hương vị hấp dẫn khác.");
        tvTitleFreezeCoffee.setVisibility(View.VISIBLE);
        imgFreezeCoffee.setVisibility(View.VISIBLE);
        tvContentFreezeCoffee.setVisibility(View.VISIBLE);
        btnFreezeCoffee.setVisibility(View.VISIBLE);

        // Set Button change MenuActivity
        btnFreezeNoCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FreezeActivity.this, MenuFreezeNoCoffeeActivity.class);
                startActivity(intent);
            }
        });

        btnFreezeCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FreezeActivity.this, MenuFreezeCoffeeActivity.class);
                startActivity(intent);
            }
        });
    }
}