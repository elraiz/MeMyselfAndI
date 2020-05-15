package com.elraiz.memyselfandi;

//NIM : 10117163
//Nama : Muhamad El Raiz
//Kelas : IF5

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.MyViewHolder> {

    private Context mContext;
    private List<App> apps;

    public CustomAdaptor(Context mContext, List<App> apps) {
        this.mContext = mContext;
        this.apps = apps;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgfriend;
        TextView txtnama;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtnama = itemView.findViewById(R.id.txt_nama);
            imgfriend = itemView.findViewById(R.id.img_friend);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.layout_list_item,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        App app = apps.get(position);

        holder.txtnama.setText(app.getName());
        holder.imgfriend.setImageResource(app.getImage());


    }

    @Override
    public int getItemCount() {

        return apps.size();
    }
}
