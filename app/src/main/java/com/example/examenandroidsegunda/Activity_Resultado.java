package com.example.examenandroidsegunda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Activity_Resultado extends Activity {
    TextView tvResultado;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvResultado = findViewById(R.id.tvResultado);

        Intent i = getIntent();

        tvResultado.setText(i.getStringExtra("c"));



    }



    public void cerrar(View v){
        finish();
    }
}
