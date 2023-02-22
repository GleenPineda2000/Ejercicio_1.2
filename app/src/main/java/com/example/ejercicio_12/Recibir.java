package com.example.ejercicio_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Recibir extends AppCompatActivity {


    TextView nombre,apellido,edad,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir);

nombre = (TextView) findViewById(R.id.nombre);
apellido = (TextView) findViewById(R.id.apellido);
edad = (TextView) findViewById(R.id.edad);
correo = (TextView) findViewById(R.id.correo);

Intent intent = getIntent();
Bundle extras = intent.getExtras();

String nombremostrar = (String)extras.get("nombre");
String apellidomostrar = (String)extras.get("apellido");
String edadmostrar = (String)extras.get("edad");
String correomostrar = (String)extras.get("correo");

nombre.setText(nombremostrar);
apellido.setText(apellidomostrar);
edad.setText(edadmostrar);
correo.setText(correomostrar);


    }
}