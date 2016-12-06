package com.example.josep.recycledview;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by Josep on 10/11/2016.
 */

public class Peliculas {
    private String titulo;
    private String director;
    private String actor;
    private String fecha_estreno;
    private int imagen;

    public Peliculas(String titulo, String director, String actor, String fecha_estreno, int imagen) {

        this.titulo = titulo;

        this.director = director;

        this.actor = actor;

        this.fecha_estreno = fecha_estreno;

        this.imagen= imagen;
    }

    public String getActor() {
        return actor;
    }

    public String getDirector() {
        return director;
    }

    public String getFecha_estreno() {
        return fecha_estreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setFecha_estreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

}
