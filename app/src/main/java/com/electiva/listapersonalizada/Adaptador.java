package com.electiva.listapersonalizada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends ArrayAdapter{

    public Context context;
    public String equipos[];
    public String descripciones[];
    public int[] imagenes;
    View fila;

    public Adaptador(Context contexto, String[] equipo, int[] imagen, String[] descripcion) {
        super(contexto,R.layout.fila,descripcion);
        this.context = contexto;
        this.equipos = equipo;
        this.descripciones = descripcion;
        this.imagenes = imagen;
    }
    @Override
    public View getView(int position, View v, ViewGroup parent){

        LayoutInflater inflar = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        fila = inflar.inflate(R.layout.fila,parent,false);
        TextView tvEquipo = fila.findViewById(R.id.tvEquipo);
        ImageView img = fila.findViewById(R.id.imgEscudo);
        tvEquipo.setText(equipos[position]);
        img.setImageResource(imagenes[position]);

        return fila;
    }
}
