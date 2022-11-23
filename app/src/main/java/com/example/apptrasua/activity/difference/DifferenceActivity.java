package com.example.apptrasua.activity.difference;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.apptrasua.activity.difference.menu.MenuPackagedCoffeeActivity;
import com.example.apptrasua.activity.difference.menu.MenuMerchandiseActivity;
import com.example.apptrasua.R;
import com.example.apptrasua.activity.difference.menu.MenuPastryActivity;

public class DifferenceActivity extends AppCompatActivity {

    TextView tvTitlePastry, tvContentPastry, tvTitleMerchandise, tvContentMerchandise, tvTitlePackagedCoffee, tvContentPackagedCoffee;
    ImageView imgPastry, imgMerchandise, imgPackagedCoffee;
    Button btnPastry, btnMerchandise, btnPackagedCoffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        tvTitlePastry = findViewById(R.id.text_view_title_1);
        tvTitleMerchandise = findViewById(R.id.text_view_title_2);
        tvTitlePackagedCoffee = findViewById(R.id.text_view_title_3);
        tvContentPastry = findViewById(R.id.text_view_content_1);
        tvContentMerchandise = findViewById(R.id.text_view_content_2);
        tvContentPackagedCoffee = findViewById(R.id.text_view_content_3);
        imgPastry = findViewById(R.id.image_view_1);
        imgMerchandise = findViewById(R.id.image_view_2);
        imgPackagedCoffee = findViewById(R.id.image_view_3);
        btnPastry = findViewById(R.id.button_1);
        btnMerchandise = findViewById(R.id.button_2);
        btnPackagedCoffee = findViewById(R.id.button_3);

        tvTitlePastry.setText("BÁNH NGỌT");
        imgPastry.setImageResource(R.drawable.image_pastry);
        tvContentPastry.setText("Còn gì tuyệt vời hơn khi kết hợp thưởng thức đồ uống của bạn cùng với những chiếc bánh ngọt ngon tinh tế được làm thủ công ngay tại bếp bánh của Highlands Coffee. Những chiếc bánh của chúng tôi mang hương vị đặc trưng của ẩm thực Việt và còn là sự Tận Tâm, gửi gắm mà chúng tôi dành cho Quý khách hàng.Còn gì tuyệt vời hơn khi kết hợp thưởng thức đồ uống của bạn cùng với những chiếc bánh ngọt ngon tinh tế được làm thủ công ngay tại bếp bánh của Highlands Coffee. Những chiếc bánh của chúng tôi mang hương vị đặc trưng của ẩm thực Việt và còn là sự Tận Tâm, gửi gắm mà chúng tôi dành cho Quý khách hàng.");
        tvTitlePastry.setVisibility(View.VISIBLE);
        imgPastry.setVisibility(View.VISIBLE);
        tvContentPastry.setVisibility(View.VISIBLE);
        btnPastry.setVisibility(View.VISIBLE);

        tvTitleMerchandise.setText("MERCHANDISE");
        imgMerchandise.setImageResource(R.drawable.image_merchandise);
        tvContentMerchandise.setText("Với nguồn cảm hứng bất tận về những nét đẹp văn hóa, những bản sắc và tinh hoa của dân tộc, được lưu truyền từ thế hệ này sang thế hệ khác trong suốt chiều dài lịch sử phát triển của đất nước, Highlands Coffee đã gói trọn tình yêu Việt Nam theo góc nhìn hoàn toàn mới mẻ, thông qua những cách điệu tinh tế, nhưng không mất đi sự gần gũi trên từng sản phẩm của bộ sưu tập ly tách \"Vẻ đẹp Việt qua lăng kính Highlands Coffee\".");
        tvTitleMerchandise.setVisibility(View.VISIBLE);
        imgMerchandise.setVisibility(View.VISIBLE);
        tvContentMerchandise.setVisibility(View.VISIBLE);
        btnMerchandise.setVisibility(View.VISIBLE);

        tvTitlePackagedCoffee.setText("CÀ PHÊ ĐÓNG GÓI");
        imgPackagedCoffee.setImageResource(R.drawable.image_packed_coffee);
        tvContentPackagedCoffee.setText("Bạn muốn trổ tài pha chế những ly cà phê đậm đà, thơm ngon ngay tại nhà; hay chỉ đơn giản là đang tìm một món quà không quá cầu kì, nhưng đậm chất nghĩa tình dành cho những người bạn quan tâm. Vậy thì dòng sản phẩm Cà phê đóng gói đa dạng về thể loại tại Highlands Coffee sẽ là một gợi ý hay ho đáng để bạn lưu tâm đấy.");
        tvTitlePackagedCoffee.setVisibility(View.VISIBLE);
        imgPackagedCoffee.setVisibility(View.VISIBLE);
        tvContentPackagedCoffee.setVisibility(View.VISIBLE);
        btnPackagedCoffee.setVisibility(View.VISIBLE);

        btnPastry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DifferenceActivity.this, MenuPastryActivity.class);
                startActivity(intent);
            }
        });

        btnMerchandise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DifferenceActivity.this, MenuMerchandiseActivity.class);
                startActivity(intent);
            }
        });

        btnPackagedCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DifferenceActivity.this, MenuPackagedCoffeeActivity.class);
                startActivity(intent);
            }
        });
    }
}