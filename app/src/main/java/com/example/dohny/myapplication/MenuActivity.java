package com.example.dohny.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final Button kalkulacka = (Button) findViewById(R.id.kalkulacka);
        final Button zavody = (Button) findViewById(R.id.zavody);

    }
}
