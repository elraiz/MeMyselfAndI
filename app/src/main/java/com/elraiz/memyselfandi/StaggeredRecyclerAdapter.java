package com.elraiz.memyselfandi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//NIM : 10117163
//Nama : Muhamad El Raiz
//Kelas : IF5

//14 Mei 2020 pembuatan staggered recycle adapter sebagai adaptor untuk menampung adaptor untuk menampilkan kumpulan foto pada activity gallery
//15 Mei 2020 merapihkan dan menyempurnaan kode

public class StaggeredRecyclerAdapter extends RecyclerView.Adapter<StaggeredRecyclerAdapter.ImageViewHolder> {

    Context mContext;
    List<row>mdata;

    public StaggeredRecyclerAdapter(Context mContext, List<row> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.row_item,viewGroup,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder imageViewHolder, int i) {

        //bind image
        imageViewHolder.img.setImageResource(mdata.get(i).getImg());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.row_img);
        }
    }
}
