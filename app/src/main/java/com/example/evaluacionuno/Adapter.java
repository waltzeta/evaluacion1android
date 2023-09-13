package com.example.evaluacionuno;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<String> vidas;

    public Adapter(ArrayList<String> vidas) {
        this.vidas = vidas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_vidas_jefes,null,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.asignar(vidas.get(position));
    }

    @Override
    public int getItemCount() {
        return vidas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtVida;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtVida = itemView.findViewById(R.id.VidaJefe);
        }

        public void asignar(String s) {
            txtVida.setText(s);
        }
    }
}
