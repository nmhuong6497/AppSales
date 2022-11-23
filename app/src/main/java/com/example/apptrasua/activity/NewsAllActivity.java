package com.example.apptrasua.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptrasua.News;
import com.example.apptrasua.R;
import com.example.apptrasua.adapter.NewsAdapter;

import java.util.List;

public class NewsAllActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    NewsAdapter newsAdapter;
    List<News> newsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_all);

        recyclerView = findViewById(R.id.recycler_view_news);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        newsList = News.getMock();
        newsAdapter = new NewsAdapter(newsList);
        recyclerView.setAdapter(newsAdapter);
        recyclerView.setHasFixedSize(true);
    }
}