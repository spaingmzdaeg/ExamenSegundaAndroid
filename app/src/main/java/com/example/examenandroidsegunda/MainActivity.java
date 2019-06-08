package com.example.examenandroidsegunda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText cajaNumero;
    Button b1;
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrar(View v){
        cajaNumero = findViewById(R.id.cajaNumero);
        b1 = findViewById(R.id.button);


        Conversion obj = new Conversion();

        EditText res = findViewById(R.id.cajaResultado);


        byte decimal = Byte.parseByte(cajaNumero.getText().toString());
        byte decimalArray[] = obj.convertirDecimalBinario(decimal);
        byte c1[] = obj.complemento1(decimalArray);
        byte c2[] = obj.complemento2(c1);

        String resultado = Arrays.toString(c2);



        Intent i = new Intent(this,Activity_Resultado.class);
        i.putExtra("c",resultado);



        startActivityForResult(i,REQUEST_CODE);
       // startActivity(i);
    }

}
