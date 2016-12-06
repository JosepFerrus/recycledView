package com.example.josep.recycledview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private RecyclerView.LayoutManager rv2;
    private Adaptador aPeli;
    private List <Peliculas>pelicules  = new ArrayList<>();
    private int contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Button añadir = (Button) findViewById(R.id.button);
        final Button eliminar = (Button) findViewById(R.id.Eliminar);






       pelicules = new ArrayList();
        for (int i=0;i<5;i++){
            pelicules.add(new Peliculas("Titanic","ni idea","leo","17-12-2016",R.drawable.claqueta));
            pelicules.add(new Peliculas("El bueno el malo y el feo","creo que el malo","el feo","mañana",R.drawable.claqueta));
            pelicules.add(new Peliculas("Prince of persia","Alguien","un actor","15-10-2012",R.drawable.claqueta));

        }


        añadir.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                pelicules.add(0,new Peliculas("Proba","Jose","Adrian","07/10/1995",R.drawable.claqueta));

                aPeli.notifyItemRangeChanged(0,aPeli.getItemCount());

            }
        });





        rv=(RecyclerView)findViewById(R.id.RecyclerView);

        rv2=new LinearLayoutManager(this);
        rv.setLayoutManager(rv2);
        aPeli= new Adaptador(pelicules);
        rv.setAdapter(aPeli);
    }
}
