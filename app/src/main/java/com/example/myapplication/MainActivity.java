package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

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

        modo_emocion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(), "Pulsado modo emoción",Toast.LENGTH_SHORT).show();

            }
        });
    }
}