package com.example.apptrasua.coffee.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.apptrasua.Product;
import com.example.apptrasua.ProductAdapter;
import com.example.apptrasua.R;

import java.util.List;

public class MenuCoffeePhinDiActivity extends AppCompatActivity {

    TextView tvTitle;
    RecyclerView recyclerViewProduct;
    ProductAdapter productAdapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvTitle = findViewById(R.id.text_view_title);
        recyclerViewProduct = findViewById(R.id.recycler_view_product);

        tvTitle.setText("PHINDI - CÀ PHÊ PHIN THẾ HỆ MỚI");
        int numberOfColumns = 2;
        recyclerViewProduct.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        productList = Product.getMockCoffeePhinDi();
        productAdapter = new ProductAdapter(productList);
        recyclerViewProduct.setAdapter(productAdapter);
        recyclerViewProduct.setHasFixedSize(true);
    }
}