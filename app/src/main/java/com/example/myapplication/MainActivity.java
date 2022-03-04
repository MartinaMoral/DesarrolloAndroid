package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button modo_texto;
    Button modo_voz;
    Button modo_foto;
    Button modo_emocion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modo_emocion = findViewById(R.id.modo_emocion);
        modo_texto = findViewById(R.id.modo_texto);

        modo_emocion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(), "Pulsado modo emoción",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (getApplicationContext(), activity_seleccionar_emocion.class);
                startActivityForResult(intent, 0);
            }
        });

        modo_texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(), "Pulsado modo emoción",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (getApplicationContext(), modo_texto2.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}