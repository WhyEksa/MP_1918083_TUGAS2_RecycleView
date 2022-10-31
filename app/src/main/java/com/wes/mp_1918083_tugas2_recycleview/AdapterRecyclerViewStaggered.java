package com.wes.mp_1918083_tugas2_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerViewStaggered extends RecyclerView.Adapter<AdapterRecyclerViewStaggered.ViewHolder> {

    private ArrayList<ItemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textSubhead;
        ImageView imageIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textHead = itemView.findViewById(R.id.text_headline);
            textSubhead = itemView.findViewById(R.id.text_subhead);
            imageIcon = itemView.findViewById(R.id.imageList);
        }
    }

    AdapterRecyclerViewStaggered(ArrayList<ItemModel> dataItem) {
        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public AdapterRecyclerViewStaggered.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_staggered, parent, false);
        return new AdapterRecyclerViewStaggered.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerViewStaggered.ViewHolder holder, int position) {

        TextView textHead = holder.textHead;
        TextView textSubhead = holder.textSubhead;
        ImageView imageIcon = holder.imageIcon;

        textHead.setText(dataItem.get(position).getName());
        textSubhead.setText(dataItem.get(position).getType());
        imageIcon.setImageResource(dataItem.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }


}