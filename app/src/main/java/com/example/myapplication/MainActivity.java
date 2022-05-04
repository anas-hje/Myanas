package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup r1;
    RadioGroup r2;
    CheckBox ch1;
    CheckBox ch2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup r1=findViewById(R.id.grp1);
        RadioGroup r2=findViewById(R.id.grp2);
        CheckBox ch1=findViewById(R.id.gras);
        CheckBox ch2=findViewById(R.id.italic);
        TextView res=findViewById(R.id.res);
        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (r1.getCheckedRadioButtonId()) {
                    case R.id.noire:
                        res.setTextColor(Color.BLACK);
                        break;
                    case R.id.jaune:
                        res.setTextColor(Color.YELLOW);
                        break;
                    case R.id.bleu:
                        res.setTextColor(Color.BLUE);
                        break;
                    case R.id.Rouge:
                        res.setTextColor(Color.RED);
                        break;

                }
            }
        }
        );
        r2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (r2.getCheckedRadioButtonId()) {
                    case R.id.dp30:
                        res.setTextSize(30);
                        break;
                    case R.id.dp40:
                        res.setTextSize(40);
                        break;
                    case R.id.dp50:
                        res.setTextSize(50);
                        break;
                    case R.id.dp60:
                        res.setTextSize(60);
                        break;
            }
        }});
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ch1.isChecked()){
                    res.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                }
            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ch2.isChecked()){
                    res.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                }
            }
        });


    }




    }


