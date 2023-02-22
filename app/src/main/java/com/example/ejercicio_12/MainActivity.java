package com.example.ejercicio_12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button enviar;
    EditText nombre,apellido,edad,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        enviar = (Button) findViewById(R.id.ingresar);
        nombre = (EditText) findViewById(R.id.idnombre);
        apellido = (EditText) findViewById(R.id.idapellido);
        edad = (EditText) findViewById(R.id.idedad);
        correo = (EditText) findViewById(R.id.idcorreo);

enviar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {


        Intent intent = new Intent(MainActivity.this, Recibir.class);
        String nombrepersona = nombre.getText().toString();
        String apellidopersona = apellido.getText().toString();
        String edadpersona = edad.getText().toString();
        String correopersona = correo.getText().toString();

        intent.putExtra("nombre",nombrepersona);
        intent.putExtra("apellido",apellidopersona);
        intent.putExtra("edad",edadpersona);
        intent.putExtra("correo",correopersona);

        startActivity(intent);







    }
});









    }
}