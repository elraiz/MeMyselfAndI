package com.elraiz.memyselfandi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//NIM : 10117163
//Nama : Muhamad El Raiz
//Kelas : IF5

public class CustomAdaptorDaily extends RecyclerView.Adapter<CustomAdaptorDaily.MyViewHolder> {
    private Context mContext;
    private List<App2> apps2;

    public CustomAdaptorDaily(Context mContext, List<App2> apps2) {
        this.mContext = mContext;
        this.apps2 = apps2;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtaktivitas;
        TextView txtjam;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtaktivitas = itemView.findViewById(R.id.txt_aktivitas);
            txtjam = itemView.findViewById(R.id.txt_jam);
        }
    }

    @NonNull
    @Override
    public CustomAdaptorDaily.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.layout_list_daily,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdaptorDaily.MyViewHolder holder, int position) {

        App2 app2 = apps2.get(position);

        holder.txtaktivitas.setText(app2.getAktivitas());
        holder.txtjam.setText(app2.getJam());

    }

    @Override
    public int getItemCount() {

        return apps2.size();
    }
}
