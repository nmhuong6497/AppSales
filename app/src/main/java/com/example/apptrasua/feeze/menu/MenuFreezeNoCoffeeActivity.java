package com.example.apptrasua.feeze.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.apptrasua.Product;
import com.example.apptrasua.ProductAdapter;
import com.example.apptrasua.R;

import java.util.List;

public class MenuFreezeNoCoffeeActivity extends AppCompatActivity {

    RecyclerView recyclerViewProduct;
    ProductAdapter productAdapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerViewProduct = findViewById(R.id.recycler_view_product);
        int numberOfColumns = 2;
        recyclerViewProduct.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        productList = Product.getMockFreezeNoCoffee();
        productAdapter = new ProductAdapter(productList);
        recyclerViewProduct.setAdapter(productAdapter);
        recyclerViewProduct.setHasFixedSize(true);
    }
}