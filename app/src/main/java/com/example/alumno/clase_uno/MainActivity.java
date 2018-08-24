package com.example.alumno.clase_uno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt1 = (TextView) findViewById(R.id.txt1);
        EditText txe1 = (EditText) findViewById(R.id.txe1);
        Button btn1 = (Button) findViewById(R.id.btn1);

        txe1.setHint("ver");
        txt1.setText("--------");
        btn1.setText("Mostrar!");
        Escuchador escuchador = new Escuchador();
        btn1.setOnClickListener(escuchador);
    }
}
