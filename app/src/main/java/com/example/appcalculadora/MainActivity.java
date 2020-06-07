package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.*;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    public double resultado = 0;
    public int n1 = 0;
    public int n2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);
    }

    public void Igual(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        n1 = Integer.parseInt(valor1);
        n2 = Integer.parseInt(valor2);

        String res = String.valueOf(resultado);
        tv1.setText(res);

    }
    public void Limpiar(View view){
        et1.setText("");
        et2.setText("");
        tv1.setText("Resultado...");
    }

    public void Suma(View view){
        resultado = n1 + n2;
    }
    public void Resta(View view){ resultado = n1 - n2; }
    public void Multiplicacion(View view){ resultado = n1 * n2; }
    public void Division(View view){
        if (n2 != 0){
            resultado = n1 / n2;
        }else{
            tv1.setText("La división para cero no existe");
        }
    }
    public void Seno(View view){
        resultado = Math.sin(n1 + n2);
    }
    public void Coseno(View view){
        resultado = Math.cos(n1 + n2);
    }
    public void Tangente(View view){
        resultado = Math.tan(n1 + n2);
    }
}