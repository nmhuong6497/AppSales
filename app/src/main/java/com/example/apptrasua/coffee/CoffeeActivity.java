package com.example.apptrasua.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apptrasua.coffee.menu.MenuCoffeeEspressoActivity;
import com.example.apptrasua.R;
import com.example.apptrasua.coffee.menu.MenuCoffeePhinActivity;
import com.example.apptrasua.coffee.menu.MenuCoffeePhinDiActivity;

public class CoffeeActivity extends AppCompatActivity {

    TextView tvTitlePhin, tvContentPhin, tvTitlePhindi, tvContentPhindi, tvTitleEspresso, tvContentEspresso;
    ImageView imgPhin, imgPhindi, imgEspresso;
    Button btnPhin, btnPhinDi, btnEspresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        tvTitlePhin = findViewById(R.id.text_view_title_1);
        tvTitlePhindi = findViewById(R.id.text_view_title_2);
        tvTitleEspresso = findViewById(R.id.text_view_title_3);
        tvContentPhin = findViewById(R.id.text_view_content_1);
        tvContentPhindi = findViewById(R.id.text_view_content_2);
        tvContentEspresso = findViewById(R.id.text_view_content_3);
        imgPhin = findViewById(R.id.image_view_1);
        imgPhindi = findViewById(R.id.image_view_2);
        imgEspresso = findViewById(R.id.image_view_3);
        btnPhin = findViewById(R.id.button_1);
        btnPhinDi = findViewById(R.id.button_2);
        btnEspresso = findViewById(R.id.button_3);

        // Set View
        tvTitlePhin.setText("CÀ PHÊ PHIN");
        imgPhin.setImageResource(R.drawable.cf_phin);
        tvContentPhin.setText("Việt Nam tự hào sở hữu một di sản văn hóa cà phê giàu có, và 'Phin' chính là linh hồn, là nét văn hóa thưởng thức cà phê đã ăn sâu vào tiềm thức biết bao người Việt. Cà phê rang xay được chiết xuất chậm rãi từng giọt một thông qua dụng cụ lọc bằng kim loại có tên là 'Phin', cũng giống như thể hiện sự sâu sắc trong từng suy nghĩ và chân thành trong những mối quan hệ hiện hữu. Bạn có thể tùy thích lựa chọn uống nóng hoặc dùng chung với đá, có hoặc không có sữa đặc. Highlands Coffee tự hào phục vụ cà phê Việt theo cách truyền thống của người Việt.");
        tvTitlePhin.setVisibility(View.VISIBLE);
        imgPhin.setVisibility(View.VISIBLE);
        tvContentPhin.setVisibility(View.VISIBLE);
        btnPhin.setVisibility(View.VISIBLE);

        tvTitlePhindi.setText("PHINDI - CÀ PHÊ PHIN THẾ HỆ MỚI");
        imgPhindi.setImageResource(R.drawable.cf_phindi);
        tvContentPhindi.setText("Một thế hệ Cà Phê Phin Việt Nam hoàn toàn mới, phục vụ cho thế hệ trẻ đầy nhiệt huyết, độc lập và sáng tạo. Vẫn mang trong mình tinh tuý chắt lọc từ Cà Phê Phin Việt Nam nhưng êm chất Phin, kết hợp độc đáo cùng những vị ngon từ Kem Sữa - Hạnh Nhân - Choco. PhinDi, Cà Phê Phin Thế Hệ Mới - Chất Phin Êm, Ngon Tròn Vị!");
        tvTitlePhindi.setVisibility(View.VISIBLE);
        imgPhindi.setVisibility(View.VISIBLE);
        tvContentPhindi.setVisibility(View.VISIBLE);
        btnPhinDi.setVisibility(View.VISIBLE);

        tvTitleEspresso.setText("CÀ PHÊ ESPRESSO");
        imgEspresso.setImageResource(R.drawable.cf_espresso);
        tvContentEspresso.setText("Hãy quên đi những bộn bề cuộc sống để tìm thấy những niềm vui nho nhỏ từ ly Cà phê Espresso của Highlands Coffee. Bí quyết để cho ra hương vị đậm đà, tinh tế của một tách cà phê Espresso là phương pháp phối trộn độc đáo, công phu giữa hai loại cà phê Arabica và Robusta thượng hạng, và đặc biệt là không thể thiếu được kĩ năng pha chế điêu luyện từ các Barista của chúng tôi.");
        tvTitleEspresso.setVisibility(View.VISIBLE);
        imgEspresso.setVisibility(View.VISIBLE);
        tvContentEspresso.setVisibility(View.VISIBLE);
        btnEspresso.setVisibility(View.VISIBLE);

        // Set Button change MenuActivity
        btnPhin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CoffeeActivity.this, MenuCoffeePhinActivity.class);
                startActivity(intent);
            }
        });

        btnPhinDi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CoffeeActivity.this, MenuCoffeePhinDiActivity.class);
                startActivity(intent);
            }
        });

        btnEspresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CoffeeActivity.this, MenuCoffeeEspressoActivity.class);
                startActivity(intent);
            }
        });
    }
}