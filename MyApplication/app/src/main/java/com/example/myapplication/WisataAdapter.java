package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.MyHolder> {

    Context context;
    String rname[];
    String rlocation[];
    String rdetail[];
    int rimage[];

    public WisataAdapter(Context c, String[] rname, String[] rlocation,String[] rdetail, int[] rimage) {
        this.rname = rname;
        this.rlocation = rlocation;
        this.rdetail = rdetail;
        this.rimage = rimage;
        this.context=c;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_list_cardview, parent , false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.img.setImageResource(rimage[position]);
        holder.txt1.setText(rname[position]);
        holder.txt2.setText(rlocation[position]);
        holder.txt3.setText(rdetail[position]);

    }

    @Override
    public int getItemCount() {
        return rname.length;
    }

    class MyHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView txt1  ,txt2, txt3;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.wisata_image);
            txt1=itemView.findViewById(R.id.wisata_name);
            txt2=itemView.findViewById(R.id.wisata_location);
            txt3=itemView.findViewById(R.id.wisata_details);


            itemView.setOnClickListener(v -> {

                Intent intent=new Intent(context , Details.class);
                intent.putExtra("name" , rname[getAdapterPosition()]);
                intent.putExtra("location" , rlocation[getAdapterPosition()]);
                intent.putExtra("detail" , rdetail[getAdapterPosition()]);
                intent.putExtra("image" , rimage[getAdapterPosition()]);
                context.startActivity(intent);

            });

        }
    }

}
