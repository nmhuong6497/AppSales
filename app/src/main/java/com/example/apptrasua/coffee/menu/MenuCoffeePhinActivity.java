package com.example.apptrasua.coffee.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.apptrasua.Product;
import com.example.apptrasua.ProductAdapter;
import com.example.apptrasua.R;

import java.util.List;

public class MenuCoffeePhinActivity extends AppCompatActivity {

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

        tvtitle.setText("Cà phê truyền thống");
        int numberOfColumns = 2;
        recyclerViewProduct.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        productList = Product.getMockCoffeePhin();
        productAdapter = new ProductAdapter(productList);
        recyclerViewProduct.setAdapter(productAdapter);
        recyclerViewProduct.setHasFixedSize(true);

        productAdapter.setOnItemClickListener(new ProductAdapter.OnItemClickListener() {

            TextView tvNumberOfProducts, tvNumberDown, tvNumberUp, tvPriceTotal, tvPay, tvClose;
            ProgressBar pgbLoading;
            int count = 1;

            @Override
            public void onClick(int position) {

                Dialog dialog = new Dialog(MenuCoffeePhinActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.layout_payment);
                dialog.setCancelable(false);

                Window window = dialog.getWindow();

                if (window != null) {
                    window.setGravity(Gravity.CENTER);
                    window.setLayout(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                }

                tvNumberOfProducts = dialog.findViewById(R.id.text_view_number_of_products);
                tvNumberDown = dialog.findViewById(R.id.text_view_number_down);
                tvNumberUp = dialog.findViewById(R.id.text_view_number_up);
                tvPriceTotal = dialog.findViewById(R.id.text_view_price_total);
                tvPay = dialog.findViewById(R.id.text_view_pay);
                tvClose = dialog.findViewById(R.id.text_view_close);
                pgbLoading = dialog.findViewById(R.id.progressBar);

                tvClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        count = 1;
                    }
                });

                tvNumberDown.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (count >= 1) {
                            count = count - 1;
                            tvNumberOfProducts.setText(count + "");
                        }
                    }
                });

                tvNumberUp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        count = count + 1;
                        tvNumberOfProducts.setText(count + "");
                    }
                });

                tvPay.setOnClickListener(new View.OnClickListener() {
                    boolean isRun = true;

                    @Override
                    public void onClick(View view) {
                        tvNumberDown.setEnabled(false);
                        tvNumberUp.setEnabled(false);
                        tvClose.setEnabled(false);
                        if (isRun) {
                            tvPay.setVisibility(View.INVISIBLE);
                            pgbLoading.setVisibility(View.VISIBLE);
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    pgbLoading.setVisibility(View.INVISIBLE);
                                    tvPay.setVisibility(View.VISIBLE);
                                    tvPay.setText("✅\nBạn đã thanh toán thành công");
                                    isRun = false;
                                    tvClose.setEnabled(true);
                                }
                            }, 2000);
                        }
                    }
                });
                dialog.show();
            }
        });
    }
}