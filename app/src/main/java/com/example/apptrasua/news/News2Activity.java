package com.example.apptrasua.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apptrasua.R;

public class News2Activity extends AppCompatActivity {

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

        tvTitle.setText("LÀM GÌ THÌ LÀM, CÀ PHÊ CÁI ĐÃ CÙNG HIGHLANDS COFFEE!");
        tvDate.setText("Thứ sáu, 11/03/2022, 11:44 GMT+7");
        img.setImageResource(R.drawable.image_news_2);
        tvContent.setText("Họp “hành” lúc 7h sáng? Deadlines bám đuổi sát nút? Việc nhà chất thành đống? “Tám” chuyện “cột sống” hết ngày hết giờ với lũ bạn thân? Biết bao nhiêu là thứ xảy ra hằng ngày bạn phải để tâm đến. Nhưng mà…\n" +
                "\n" +
                "LÀM GÌ THÌ LÀM, CÀ PHÊ CÁI ĐÃ!\n" + "Cà phê là một thành phần quan trọng trong đời sống con người. Điều đó đã được minh chứng suốt chiều dài lịch sử, khi mà cà phê xuất hiện mọi lúc, mọi nơi và có tầm ảnh hưởng lớn đến nhân loại.\n" +
                "\n" +
                "Mà thôi nói chi đâu cho xa xôi, ly cà phê đậm đà là trợ thủ đắc lực, giúp bạn tỉnh táo, sẵn sàng đối đầu với việc làm, việc học và cả… việc nhà. Hơn thế nữa, chút vị cà phê thơm nồng còn tăng thêm phần hứng khởi, khơi nguồn vui vẻ cho những cuộc gặp gỡ bạn bè, tụ họp gia đình…\n" +
                "\n" +
                "Và bất cứ khi nào bạn cần cà phê, Highlands Coffee có mặt!" + "Highlands Coffee luôn luôn cố gắng mang đến bạn vị cà phê thơm ngon nhất, với chất lượng cao nhất, giúp bạn tận hưởng từng giây từng phút trong cuộc sống, đánh thức nhịp sống năng động bên trong bạn và giải tỏa những căng thẳng thường nhật.\n" +
                "\n" +
                "Từ Phin Sữa Đá đậm đà chất phin, đến PhinDi Hạnh Nhân vị êm ngọt dịu, hay Caramel Phin Freeze phá cách cực chill cực đã, Highlands Coffee luôn đồng hành với bạn trong từng khoảnh khắc cuộc sống.\n" +
                "\n" +
                "Chần chừ gì mà không đến ngay quán Highlands Coffee ưng ý, chọn cho mình ly cà phê như ý và CÀ PHÊ CÁI ĐÃ rồi làm gì thì làm bạn ơi?");
    }
}