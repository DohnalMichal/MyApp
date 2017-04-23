package com.example.dohny.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import java.util.function.DoublePredicate;

public class CalculatorActivity extends AppCompatActivity {
    EditText etVzdalenost, splitMM, splitSS, casMM, casSS;
    Button vzdalenost, split, cas;

   /* int splitVteriny;
    int splitMinuty;
    int casMinuty;
    int casVteriny;
    int vzdalenost;
    int split;
    int cas;   */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        etVzdalenost = (EditText) findViewById(R.id.etVzdalenost);
        vzdalenost = (Button) findViewById(R.id.bSpocitejVzdalenost);
        splitMM = (EditText) findViewById(R.id.splitMM);
        splitSS = (EditText) findViewById(R.id.splitSS);
        split = (Button) findViewById(R.id.bSpocitejSplit);
        casMM = (EditText) findViewById(R.id.casMM);
        casSS = (EditText) findViewById(R.id.casSS);
        cas = (Button) findViewById(R.id.bSpocitejCas);
    }
    //EditText lat_source = (EditText)findViewById(R.id.latValue);
    //here crash -->    Double sourceLat = Double.parseDouble(lat_source.getText().toString());

    public void distanceClicked (View view){
        /*cas = (casMinuty*60)+(casVteriny);
        split = (splitMinuty*60)+(splitVteriny);
        splitVteriny = Integer.parseInt(splitSS.getText().toString());
        splitMinuty = Integer.parseInt(splitMM.getText().toString());
        vzdalenost = (cas/split)*500;
        String vzdalenost1 = new Integer(vzdalenost).toString();
        ((EditText) findViewById(R.id.etVzdalenost).setText(String.valueOf(vzdalenost1)));*/
        Double splitMinuty = Double.parseDouble(splitMM.getText().toString());
        Double splitVteriny = Double.parseDouble(splitSS.getText().toString());
        Double casVteriny = Double.parseDouble(casSS.getText().toString());
        Double casMinuty = Double.parseDouble(casMM.getText().toString());

        double split = splitMinuty + (splitVteriny / 60.0d);
        ((EditText) findViewById(R.id.etVzdalenost)).setText(String.valueOf(((int) ((casMinuty + (casVteriny / 60.0d)) / split)) * 500));

    }

    public void splitClicked (View view) {


    }

    public void timeClicked (View view) {


    }

    /*public void calculateDistance(View view) {
        double split = getDoubleValueFromView(R.id.splitMM) + (getDoubleValueFromView(R.id.splitSS) / 60.0d);
        ((EditText) findViewById(R.id.etVzdalenost)).setText(String.valueOf(((int) ((getDoubleValueFromView(R.id.casMM) + (getDoubleValueFromView(R.id.casSS) / 60.0d)) / split)) * 500));
    }  */


}
