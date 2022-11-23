package com.example.apptrasua.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.apptrasua.R;
import com.example.apptrasua.activity.coffee.CoffeeActivity;
import com.example.apptrasua.activity.difference.DifferenceActivity;
import com.example.apptrasua.activity.freeze.FreezeActivity;
import com.example.apptrasua.activity.news.News1Activity;
import com.example.apptrasua.activity.news.News2Activity;
import com.example.apptrasua.activity.news.News3Activity;
import com.example.apptrasua.activity.tea.TeaActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout layoutNews1, layoutNews2, layoutNews3;
    ImageView imgBanner;
    Button btnCoffee, btnFreeze, btnTea, btnDifferance;
    TextView tvShowAddress, tvAddress, tvNewsAll;
    int[] arrayImage = {
            R.drawable.banner_1,
            R.drawable.banner_2,
            R.drawable.banner_3
    };
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutNews1 = findViewById(R.id.layout_news_1);
        layoutNews2 = findViewById(R.id.layout_news_2);
        layoutNews3 = findViewById(R.id.layout_news_3);
        imgBanner = findViewById(R.id.image_view_banner);
        btnCoffee = findViewById(R.id.button_coffee);
        btnFreeze = findViewById(R.id.button_freeze);
        btnTea = findViewById(R.id.button_tea);
        btnDifferance = findViewById(R.id.button_difference);
        tvShowAddress = findViewById(R.id.text_view_show_store);
        tvAddress = findViewById(R.id.text_view_address);
        tvNewsAll = findViewById(R.id.text_view_news_all);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                count = count == arrayImage.length ? 0 : count;
                imgBanner.setImageResource(arrayImage[count++]);
                handler.postDelayed(this, 2000);
            }
        }, 2000);

        btnCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CoffeeActivity.class);
                startActivity(intent);
            }
        });

        btnFreeze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FreezeActivity.class);
                startActivity(intent);
            }
        });

        btnTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TeaActivity.class);
                startActivity(intent);
            }
        });

        btnDifferance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DifferenceActivity.class);
                startActivity(intent);
            }
        });

        tvNewsAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewsAllActivity.class);
                startActivity(intent);
            }
        });

        //News 1
        layoutNews1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, News1Activity.class);
                startActivity(intent);
            }
        });

        // News 2
        layoutNews2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, News2Activity.class);
                startActivity(intent);
            }
        });

        // News 3
        layoutNews3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, News3Activity.class);
                startActivity(intent);
            }
        });

        // Show address stores
        tvShowAddress.setText("Hệ thống cửa hàng  \uD83D\uDD3D");
        tvShowAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvShowAddress.getText() == "Hệ thống cửa hàng  \uD83D\uDD3D") {
                    tvAddress.setVisibility(View.VISIBLE);
                    tvShowAddress.setText("Hệ thống cửa hàng  \uD83D\uDD3C");
                } else {
                    tvAddress.setVisibility(View.GONE);
                    tvShowAddress.setText("Hệ thống cửa hàng  \uD83D\uDD3D");
                }
            }
        });
    }
}