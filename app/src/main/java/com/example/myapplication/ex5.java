package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class ex5 extends AppCompatActivity {
    EditText poid;
    EditText taille;
    RadioGroup r;
    Button calc;
    Button vider;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex5);
        poid.findViewById(R.id.poid);
        taille.findViewById(R.id.taille);
        calc.findViewById(R.id.calc);
        vider.findViewById((R.id.raz));
        result.findViewById(R.id.res);
        r.findViewById(R.id.gr);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(poid.getText().toString().isEmpty() || taille.getText().toString().isEmpty()){
                   result.setText("un champ est vide !!");
                   result.setTextColor(Color.RED);

                }else{
                    result.setTextColor(Color.BLACK);
                    result.setText("");



                }
            }
        });
    }
}