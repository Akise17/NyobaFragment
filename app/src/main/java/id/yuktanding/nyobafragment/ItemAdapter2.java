package id.yuktanding.nyobafragment;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Akise on 03/08/2017.
 */

public class ItemAdapter2 extends RecyclerView.Adapter<ItemAdapter2.MyViewHolder>{

    private ArrayList<Item> items;
    private Context context;

    public ItemAdapter2(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public ItemAdapter2.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemAdapter2.MyViewHolder holder, int position) {
        final Item item2 = items.get(position);
        Picasso.with(context).load(item2.getImgAnime()).into(holder.IMG);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView IMG;
        public MyViewHolder(View itemView) {
            super(itemView);
            IMG = (ImageView) itemView.findViewById(R.id.Anime_Name);
        }


    }
}
