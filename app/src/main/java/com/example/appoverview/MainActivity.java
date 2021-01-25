package com.example.appoverview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtContador;
    private Integer contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtContador=findViewById(R.id.txt_contador);
        txtContador.setText(contador.toString());
    }

    public void contar(View view){
        contador=contador+1;
        txtContador.setText(contador.toString());
    }

    public void metodoToast(View view){
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_LONG).show();
    }
}