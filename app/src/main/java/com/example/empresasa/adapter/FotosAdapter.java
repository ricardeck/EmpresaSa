package com.example.empresasa.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.empresasa.R;

public class FotosAdapter extends RecyclerView.Adapter<FotosAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fotos_detalhe, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.tvTitulo.setText("Treianemto Tal");
        myViewHolder.ivFoto.setImageResource(R.drawable.foto1);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitulo;
        private ImageView ivFoto;

        public MyViewHolder(View itemView) {

            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            ivFoto = itemView.findViewById(R.id.ivFoto);


        }
    }
}
