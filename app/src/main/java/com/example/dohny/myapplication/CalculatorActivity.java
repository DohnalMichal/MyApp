package com.example.dohny.myapplication;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.DoublePredicate;

public class CalculatorActivity extends AppCompatActivity {
    EditText etVzdalenost, splitMM, splitSS, casMM, casSS;
    Button vzdalenost, split, cas;

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

    public void distanceClicked (View view){
        Double splitMinuty = Double.parseDouble(splitMM.getText().toString());
        Double splitVteriny = Double.parseDouble(splitSS.getText().toString());
        Double casVteriny = Double.parseDouble(casSS.getText().toString());
        Double casMinuty = Double.parseDouble(casMM.getText().toString());

        double split = splitMinuty + (splitVteriny / 60.0d);
        ((EditText) findViewById(R.id.etVzdalenost)).setText(String.valueOf(((int) ((casMinuty + (casVteriny / 60.0d)) / split)) * 500));

    }

    public void splitClicked (View view) {
        Integer distanceEdit = Integer.parseInt(etVzdalenost.getText().toString());
        Double casVteriny = Double.parseDouble(casSS.getText().toString());
        Double casMinuty = Double.parseDouble(casMM.getText().toString());
        double split = 500.0d * (casMinuty + (casVteriny / 60.0d)) / ((double) distanceEdit);
        String splitMins = getMinutesString((double) ((int) split));
        String splitSecs = getSecondsString((split % 1.0d) * 60.0d);
        ((EditText) findViewById(R.id.splitMM)).setText(splitMins);
        ((EditText) findViewById(R.id.splitSS)).setText(splitSecs);
    }

    public void timeClicked (View view) {
        Integer distanceEdit = Integer.parseInt(etVzdalenost.getText().toString());
        Double splitMinuty = Double.parseDouble(splitMM.getText().toString());
        Double splitVteriny = Double.parseDouble(splitSS.getText().toString());
        double time = (splitMinuty + (splitVteriny / 60.0d)) * (((double) distanceEdit) / 500.0d);
        String timeMins = getMinutesString(time);
        String timeSecs = getSecondsString((time % 1.0d) * 60.0d);
        ((EditText) findViewById(R.id.casMM)).setText(timeMins);
        ((EditText) findViewById(R.id.casSS)).setText(timeSecs);
    }

    private String getSecondsString(double secs) {
        String secString = BuildConfig.FLAVOR;
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        secString = df.format(secs);
        if (secString.equalsIgnoreCase("0") || secString.equalsIgnoreCase("NaN")) {
            secString = "00";
        }
        if (secs >= 9.9d || secs <= 0.0d) {
            return secString;
        }
        return "0" + secString;
    }

    private String getMinutesString(double mins) {
        return String.valueOf((int) Math.floor(mins));
    }


}
