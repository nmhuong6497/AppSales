package com.example.apptrasua.tea.menu;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptrasua.Product;
import com.example.apptrasua.ProductAdapter;
import com.example.apptrasua.R;

import java.util.List;

public class TeaNomalActivity extends AppCompatActivity {

    TextView tvtitle;
    RecyclerView recyclerViewProduct;
    ProductAdapter productAdapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvtitle = findViewById(R.id.text_view_title);
        recyclerViewProduct = findViewById(R.id.recycler_view_product);

        tvtitle.setText("Trà");
        int numberOfColumns = 2;
        recyclerViewProduct.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        productList = Product.getMockTeaNomal();
        productAdapter = new ProductAdapter(productList);
        recyclerViewProduct.setAdapter(productAdapter);
        recyclerViewProduct.setHasFixedSize(true);

        productAdapter.setOnItemClickListener(new ProductAdapter.OnItemClickListener() {

            TextView tvName, tvPrice, tvNumberOfProducts, tvNumberDown, tvNumberUp, tvPriceTotal, tvPay, tvClose;
            Button btnPay;
            ProgressBar pgbLoading;
            ImageView img;
            int count = 1;

            @Override
            public void onClick(Product product) {

                Dialog dialog = new Dialog(TeaNomalActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.layout_payment);

                Window window = dialog.getWindow();

                if (window != null) {
                    window.setGravity(Gravity.CENTER);
                    window.setLayout(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                }

                tvName = dialog.findViewById(R.id.text_view_product);
                tvPrice = dialog.findViewById(R.id.text_view_price);
                tvNumberOfProducts = dialog.findViewById(R.id.text_view_number_of_products);
                tvNumberDown = dialog.findViewById(R.id.text_view_number_down);
                tvNumberUp = dialog.findViewById(R.id.text_view_number_up);
                tvPriceTotal = dialog.findViewById(R.id.text_view_price_total);
                tvPay = dialog.findViewById(R.id.text_view_pay);
                tvClose = dialog.findViewById(R.id.text_view_close);
                btnPay = dialog.findViewById(R.id.button_pay);
                pgbLoading = dialog.findViewById(R.id.progressBar);
                img = dialog.findViewById(R.id.image_view_product);

                img.setImageResource(product.getImage());
                tvName.setText(product.getName());
                tvPrice.setText(product.getPrice() + ".000đ");
                tvPriceTotal.setText(product.getPrice() + ".000đ");

                count = 1;
                tvNumberOfProducts.setText(count + "");
                tvClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                tvNumberDown.setEnabled(false);
                tvNumberDown.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        count = count - 1;
                        tvNumberOfProducts.setText(count + "");
                        tvPriceTotal.setText(product.getPrice() * count + ".000đ");
                        if (count < 2) {
                            tvNumberDown.setEnabled(false);
                        }
                    }
                });

                tvNumberUp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        count = count + 1;
                        tvNumberOfProducts.setText(count + "");
                        tvPriceTotal.setText(product.getPrice() * count + ".000đ");
                        if (count > 1) {
                            tvNumberDown.setEnabled(true);
                        }
                    }
                });

                btnPay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.setCancelable(false);
                        tvNumberDown.setEnabled(false);
                        tvNumberUp.setEnabled(false);
                        tvClose.setEnabled(false);
                        btnPay.setVisibility(View.GONE);
                        pgbLoading.setVisibility(View.VISIBLE);
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                pgbLoading.setVisibility(View.GONE);
                                tvPay.setVisibility(View.VISIBLE);
                                tvClose.setEnabled(true);
                                dialog.setCancelable(true);
                            }
                        }, 1500);
                    }
                });
                dialog.show();
            }
        });
    }
}