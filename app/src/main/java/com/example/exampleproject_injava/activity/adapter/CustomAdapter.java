package com.example.exampleproject_injava.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exampleproject_injava.R;
import com.example.exampleproject_injava.activity.listener.onBottomReachedListener;
import com.example.exampleproject_injava.activity.model.Friendly;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Friendly> friendlyList;
    Context context;
    private onBottomReachedListener listener;

    public CustomAdapter(List<Friendly> friendlyList, Context context, onBottomReachedListener listener) {
        this.friendlyList = friendlyList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_custom_layout,viewGroup,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Friendly member = friendlyList.get(position);

        if (holder instanceof CustomViewHolder) {
            TextView first_name = ((CustomViewHolder) holder).first_name;
            TextView last_name = ((CustomViewHolder) holder).last_name;
            ImageView imageView = ((CustomViewHolder)holder).imageView;
            first_name.setText(member.getNameSmall());
            last_name.setText(member.getNameStack());
            imageView.setImageResource(member.getImage());
        }
    }

    @Override
    public int getItemCount() {
        return friendlyList.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView first_name,last_name;
        public ImageView imageView;

        public CustomViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            first_name = view.findViewById(R.id.tv_1);
            last_name = view.findViewById(R.id.tv_2);
            imageView = view.findViewById(R.id.img);
        }
    }
}
