package com.example.rome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSobre;
    private Button btnTutorial;

    private Button btnContato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSobre = findViewById(R.id.buttonSobre);
        btnTutorial = findViewById(R.id.buttonTutorial);
        btnContato = findViewById(R.id.buttonContato);

        btnSobre.setOnClickListener(view -> {
            Intent intent = new Intent(this, TelaSobre.class);
            startActivity(intent);
        });

        btnTutorial.setOnClickListener(view -> {
            Intent intent = new Intent(this, TelaTutorial.class);
            startActivity(intent);
        });

        btnContato.setOnClickListener(view -> {
            Intent intent = new Intent(this, TelaContato.class);
            startActivity(intent);
        });


    }
}