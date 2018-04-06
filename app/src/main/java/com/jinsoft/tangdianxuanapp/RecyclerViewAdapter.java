package com.jinsoft.tangdianxuanapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Food> listFood;

    public RecyclerViewAdapter(Context mContext, List<Food> listFood) {
        this.mContext = mContext;
        this.listFood = listFood;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position){
        holder.title.setText(listFood.get(position).getTitle());
        holder.thumbnail.setImageResource(listFood.get(position).getThumbnail());
        holder.price.setText(String.valueOf(listFood.get(position).getPrice()));

        holder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mContext, FoodActivity.class);
                intent.putExtra("Description",listFood.get(position).getDescription());
                intent.putExtra("Price",listFood.get(position).getPrice());
                intent.putExtra("Title",listFood.get(position).getTitle());
                intent.putExtra("Thumbnail",listFood.get(position).getThumbnail());

                mContext.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount(){
        return listFood.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        ImageView thumbnail;
        TextView price;
        CardView cardView;

        public MyViewHolder(View itemView){
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.foodTitleId);
            thumbnail = (ImageView) itemView.findViewById(R.id.foodImageId);
            price = (TextView) itemView.findViewById(R.id.foodPriceId);
            cardView = (CardView) itemView.findViewById(R.id.cardViewId);
        }
    }
}
