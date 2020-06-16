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
    private TextView tv2;
    public double resultado = 0;
    public double n1 = 0;
    public double n2 = 0;
    public String res = "Resultado...";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
    }

    public void Igual(View view){//Realizar un control en esta función
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        n1 = Double.parseDouble(valor1);
        n2 = Double.parseDouble(valor2);

        res = String.valueOf(resultado);
        tv1.setText(res);

    }
    public void Limpiar(View view){
        et1.setText("");
        et2.setText("");
        tv1.setText("Resultado...");
        tv2.setText("Operador");
    }

    public void Suma(View view){
        tv2.setText("+");
        resultado = n1 + n2;
    }
    public void Resta(View view){
        tv2.setText("-");
        resultado = n1 - n2;
    }
    public void Multiplicacion(View view){
        tv2.setText("x");
        resultado = n1 * n2;
    }
    public void Division(View view){
        tv2.setText("÷");
        if (n2 != 0){
            resultado = n1 / n2;
        }else{
            res = "La división para cero no existe";
        }
    }
    public void Seno(View view){
        tv2.setText("Sen(A+B)");
        resultado = Math.sin(n1 + n2);
    }
    public void Coseno(View view){
        tv2.setText("Cos(A+B)");
        resultado = Math.cos(n1 + n2);
    }
    public void Tangente(View view){
        tv2.setText("Tan(A+B)");
        resultado = Math.tan(n1 + n2);
    }
}