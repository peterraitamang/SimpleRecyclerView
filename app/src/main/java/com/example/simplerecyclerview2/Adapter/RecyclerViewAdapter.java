package com.example.simplerecyclerview2.Adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simplerecyclerview2.Model.MyData;
import com.example.simplerecyclerview2.R;
import com.example.simplerecyclerview2.databinding.ActivityMainBinding;

import java.net.HttpRetryException;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private MyData[] myData;

    public RecyclerViewAdapter(MyData[] myData) {
        this.myData = myData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recyclerview_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyData Mydata = myData[position];
        holder.textView.setText(myData[position].getName());
        holder.imageView.setImageResource(myData[position].getImgId());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "clicked "+ Mydata.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return myData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView;
        public RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = (ImageView)  itemView.findViewById(R.id.iv_1);
            this.textView = (TextView) itemView.findViewById(R.id.tv_1);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.RelativeLayout);

        }
    }
}
