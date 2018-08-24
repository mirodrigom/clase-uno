package com.example.alumno.clase_uno;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by alumno on 23/08/2018.
 */

public class Escuchador implements View.OnClickListener {

    TextView txt1;
    EditText edt1;

    public Escuchador(TextView txt1, EditText edt1)
    {
        this.txt1 = txt1;
        this.edt1 = edt1;
    }

    @Override
    public void onClick(View v) {
        if(v.findViewById(R.id.btn1).isPressed())
        {
            txt1.setText(edt1.getText().toString());
            edt1.setText("");
        }
    }
}
