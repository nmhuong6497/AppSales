package com.example.apptrasua;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    List<News> news;

    public NewsAdapter(List<News> news) {
        this.news = news;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_news, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        holder.bind(news.get(position));
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tvName, tvDate;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.image_view_news);
            tvName = itemView.findViewById(R.id.text_view_news_name);
            tvDate = itemView.findViewById(R.id.text_view_news_date);

        }

        public void bind(News news) {
            img.setImageResource(news.getImage());
            tvName.setText(news.getName());
            tvDate.setText(news.getDate());
        }
    }
}
