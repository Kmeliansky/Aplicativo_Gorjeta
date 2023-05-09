package com.vinicius.gorjeta;

import static com.vinicius.gorjeta.R.id.btnIniciar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Variável do botão iniciar.
    private Button btnIniciar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define que a variável irá receber o conteudo do componente via ID.
        btnIniciar = findViewById(R.id.btnIniciar);

    }

    public void abreCalculadora(View view){

        // cria um objeto de inteção que ira abrir um novo activity
        Intent openActivity = new Intent(getApplicationContext(), SecondaryActivity.class);

        // Abre a Secondary activity
        startActivity(openActivity);
    }
}