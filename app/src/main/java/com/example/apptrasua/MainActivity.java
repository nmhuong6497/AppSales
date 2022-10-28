package com.example.apptrasua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apptrasua.coffee.CoffeeActivity;
import com.example.apptrasua.difference.DifferenceActivity;
import com.example.apptrasua.feeze.FreezeActivity;
import com.example.apptrasua.news.News1Activity;
import com.example.apptrasua.news.News2Activity;
import com.example.apptrasua.news.News3Activity;
import com.example.apptrasua.tea.TeaActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imgBanner, imgNews1, imgNews2, imgNews3;
    Button btnCoffee, btnFreeze, btnTea, btnDifferance;
    TextView tvNews1, tvNews2, tvNews3, tvShowAddress, tvAddress;
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

        imgBanner = findViewById(R.id.image_view_banner);
        imgNews1 = findViewById(R.id.image_view_news_1);
        imgNews2 = findViewById(R.id.image_view_news_2);
        imgNews3 = findViewById(R.id.image_view_news_3);
        btnCoffee = findViewById(R.id.button_coffee);
        btnFreeze = findViewById(R.id.button_freeze);
        btnTea = findViewById(R.id.button_tea);
        btnDifferance = findViewById(R.id.button_difference);
        tvNews1 = findViewById(R.id.text_view_news_1);
        tvNews2 = findViewById(R.id.text_view_news_2);
        tvNews3 = findViewById(R.id.text_view_news_3);
        tvShowAddress = findViewById(R.id.text_view_show_store);
        tvAddress = findViewById(R.id.text_view_address);

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

        //News 1
        imgNews1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, News1Activity.class);
                startActivity(intent);
            }
        });

        tvNews1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, News1Activity.class);
                startActivity(intent);
            }
        });

        // News 2
        imgNews2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, News2Activity.class);
                startActivity(intent);
            }
        });

        tvNews2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, News2Activity.class);
                startActivity(intent);
            }
        });

        // News 3
        imgNews3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, News3Activity.class);
                startActivity(intent);
            }
        });

        tvNews3.setOnClickListener(new View.OnClickListener() {
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