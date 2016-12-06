package com.example.josep.recycledview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static com.example.josep.recycledview.R.id.button;

/**
 * Created by Josep on 11/11/2016.
 */
public class Adaptador extends RecyclerView.Adapter <Adaptador.PeliculaViewHolder> {

        private List<Peliculas> llistaPelis;




    public Adaptador(List<Peliculas> pelicules) {
        llistaPelis=pelicules;

    }


    public static class PeliculaViewHolder extends RecyclerView.ViewHolder{



            public TextView titulo, director, actor, fecha;

            public ImageView imagen;

            public Button eliminar;


        public PeliculaViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imageView);
            titulo = (TextView) v.findViewById(R.id.titulo);
            director = (TextView) v.findViewById(R.id.director);
            actor = (TextView) v.findViewById(R.id.actor);
            fecha = (TextView) v.findViewById(R.id.fecha);
            eliminar = (Button) v.findViewById(R.id.Eliminar);

        }




    }


    @Override
    public int getItemCount() {

        return this.llistaPelis.size();
    }
    @Override
    public PeliculaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.element, parent, false);
        return new PeliculaViewHolder(v);
    }




    @Override
    public void onBindViewHolder(PeliculaViewHolder holder, final int position) {
        holder.titulo.setText(llistaPelis.get(position).getTitulo());
        holder.director.setText(llistaPelis.get(position).getDirector());
        holder.imagen.setImageResource(llistaPelis.get(position).getImagen());
        holder.actor.setText(llistaPelis.get(position).getActor());
        holder.fecha.setText(llistaPelis.get(position).getFecha_estreno());

       holder.eliminar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               llistaPelis.remove(position);
               notifyItemRemoved(position);
               notifyItemRangeChanged(position, llistaPelis.size());
           }
       });


    }






        }
