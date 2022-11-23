package com.example.apptrasua.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptrasua.Product;
import com.example.apptrasua.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{

    List<Product> products;
    private OnItemClickListener onItemClickListener;

    public ProductAdapter(List<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.bind(products.get(position));
    }
    
    @Override
    public int getItemCount() {
        return products.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tvName, tvPrice;
        private Product product;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.image_view_product);
            tvName = itemView.findViewById(R.id.text_view_product);
            tvPrice = itemView.findViewById(R.id.text_view_price);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onClick(product);
                    }
                }
            });
        }

        public void bind(Product product) {
            this.product = product;
            img.setImageResource(product.getImage());
            tvName.setText(product.getName());
            tvPrice.setText(product.getPrice() + ".000đ");
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onClick(Product product);
    }
}
