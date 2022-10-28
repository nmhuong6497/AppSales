package com.example.apptrasua.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apptrasua.R;

public class News3Activity extends AppCompatActivity {

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

        tvTitle.setText("HÈ VUI PHƠI PHỚI CÙNG BỘ 3 TRÀ NHIỆT ĐỚI");
        tvDate.setText("Thứ sáu, 01/07/2022, 14:45 GMT+7");
        img.setImageResource(R.drawable.image_news_3);
        tvContent.setText("Được rồi đi thôi, mùa hè đã về! Mong đợi bấy lâu thì kỳ nghỉ dài hơi cũng đã tới! Mùa hè đang réo gọi bạn kìa. Những kèo hội tụ nay sẽ càng thêm xôm tụ khi Highlands Coffee vừa trình làng dòng sản phẩm mới mát rười rượi nhưng lại nóng hơn cả nắng hè, TRÀ NHIỆT ĐỚI, với 3 “nhân vật chính” bao gồm Trà Ổi Hồng, Trà Mơ Sơri và Trà Xoài Nhiệt Đới!\n\n" + "TRÀ ỔI HỒNG: đây là sự kết hợp đầy thú vị giữa chất thanh mát từ trà xanh lài quyện vào hương thơm nhẹ nhàng và vị chua ngọt của ổi hồng, nhất định mang tới một trải nghiệm tuyệt vời.\n" +
                "\n" +
                "TRÀ MƠ SƠRI: một biến tấu đột phá giữa trái mơ và sơri chân chất của Việt Nam cùng hạt chia cực kỳ dinh dưỡng và những viên boba caramel giòn giòn… Tất cả tạo nên hương vị ngọt ngào, nhẹ nhàng, giúp bạn có một buổi thưởng thức trà vui vẻ.\n" +
                " \n" +
                "TRÀ XOÀI NHIỆT ĐỚI: nổi bật với vị ngọt thanh, chua nhẹ đặc trưng của xoài miền nhiệt đới, pha trộn hài hòa cùng vị trà lài cao cấp và những viên boba caramel giòn dai nhai vui miệng; sẽ mang đến cho bạn một thức uống đánh bay cái nóng mùa hè.\n" +
                "\n" +
                " “Khoa học đã chứng minh” rằng dưới cái nóng oi bức của mùa hè mà làm một ngụm Trà mát lạnh từ Highlands Coffee thì có nắng cỡ nào cũng mát, tinh thần trở nên sảng khoái, vui vẻ và phấn khởi hơn. Rồi khi mà món trà nức tiếng thanh mát của Highlands Coffee lại còn được kết hợp thêm với chất trái cây thật tươi, hạt boba caramel ngọt béo, thì độ sảng khoái chỉ có thể là tăng vùn vụt!\n" +
                "\n" +
                "Dù là trong một chuyến phượt với lũ bạn, khi thư giãn cùng gia đình, hay lúc nắm tay người thương dạo phố… thì cũng đừng quên ghé quán Highlands Coffee yêu thích, tranh thủ đặt món Trà Nhiệt Đới ngon mát để nhanh chóng đánh bay cái nóng, giải nhiệt ngày hè nhé!\n" +
                "\n" +
                "Vị trà thì thanh mát cả người, mùi trái cây thì ngọt ngào quyến rũ trên đầu lưỡi, lại còn chất dai dai nhai vui vui của boba caramel; hết thảy những yếu tố hoàn mỹ đó hòa quyện vào nhau tạo nên những cảm giác vô cùng tuyệt vời kích thích mọi giác quan. Đảm bảo bộ 3 Trà Nhiệt Đới này sẽ giúp bạn KHUẤY ĐẢO NGÀY VUI, XOÁY BAY BUỒN CHÁN!\n" +
                "\n" +
                "THỬ NGAY THÔI BẠN ƠI!");
    }
}