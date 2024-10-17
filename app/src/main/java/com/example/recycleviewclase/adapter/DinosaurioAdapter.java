package com.example.recycleviewclase.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewclase.R;
import com.example.recycleviewclase.model.dinosaurio;

import java.util.List;

public class DinosaurioAdapter extends RecyclerView.Adapter<DinosaurioAdapter.DinosaurioViewHolder>
{

    private List<dinosaurio> dinosauriosLista;

    public DinosaurioAdapter(List<dinosaurio> dinosauriosLista)
    {
        this.dinosauriosLista = dinosauriosLista;
    }

    @NonNull
    @Override
    public DinosaurioAdapter.DinosaurioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemdino, parent, false);

        return new DinosaurioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DinosaurioAdapter.DinosaurioViewHolder holder, int position)
    {
        holder.setData(dinosauriosLista.get(position));
    }

    @Override
    public int getItemCount()
    {
        return dinosauriosLista.size();
    }

    public class DinosaurioViewHolder extends RecyclerView.ViewHolder
    {
        TextView txtnombre, txttipo, txtdescripcion;
        ImageView imagendino;
        ConstraintLayout bgdino;
        dinosaurio dino;

        public DinosaurioViewHolder(@NonNull View itemView)
        {
            super(itemView);
            txtnombre = itemView.findViewById(R.id.txtnombre);
            txttipo = itemView.findViewById(R.id.txttipo);
            txtdescripcion = itemView.findViewById(R.id.txtdescripcion);
            imagendino = itemView.findViewById(R.id.imgdino);
            bgdino = itemView.findViewById(R.id.bgdino);
        }

        public void setData(dinosaurio dinosaurio)
        {
            dino = dinosaurio;
            txtnombre.setText(dinosaurio.getNombre());
            txttipo.setText(dinosaurio.getTipo());
            txtdescripcion.setText(dinosaurio.getDescripcion());
            imagendino.setImageResource(dinosaurio.getImagen());
            bgdino.setBackgroundResource(R.color.black);
        }
    }
}
