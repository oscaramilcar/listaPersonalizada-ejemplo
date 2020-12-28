package com.electiva.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    TextView txtEquipo;
    TextView txtDescripcion;
    ImageView imgDetalleEquipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Bundle bundle = getIntent().getExtras();
        txtEquipo = findViewById(R.id.tvDetalleEquipo);
        txtDescripcion = findViewById(R.id.tvDetalleDescripcion);
        imgDetalleEquipo = findViewById(R.id.imgDetalleEquipo);
        String equipo = bundle.getString("eq");
        String descripcion = bundle.getString("des");
        int imagen = bundle.getInt("img");
        txtEquipo.setText(equipo);
        txtDescripcion.setText(descripcion);
        imgDetalleEquipo.setImageResource(imagen);
    }
}
