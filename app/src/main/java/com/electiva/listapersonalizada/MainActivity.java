package com.electiva.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] equipo;
    String[] descripcion;
    int[] imgEquipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        equipo = getResources().getStringArray(R.array.equipos);
        descripcion = getResources().getStringArray(R.array.descripciones);

        int[] imagen = {
                R.drawable.athletic_bilbao,R.drawable.atletico_madrid,
                R.drawable.barcelona,R.drawable.betis,R.drawable.celta_vigo,
                R.drawable.deportivo,R.drawable.espanyol,R.drawable.getafe,
                R.drawable.granada,R.drawable.levante,R.drawable.malaga,
                R.drawable.mallorca,R.drawable.osasuna,R.drawable.rayo_vallecano,
                R.drawable.real_madrid,R.drawable.real_sociedad,
                R.drawable.sevilla,R.drawable.valencia,
                R.drawable.valladolid,R.drawable.zaragoza
        };

        imgEquipos = imagen;

        setListAdapter(new Adaptador(this,equipo,imagen,descripcion));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("eq",equipo[position]);
        intent.putExtra("des",descripcion[position]);
        intent.putExtra("img",imgEquipos[position]);
        startActivity(intent);
    }
}
