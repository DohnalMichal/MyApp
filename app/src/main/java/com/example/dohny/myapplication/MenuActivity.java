package com.example.dohny.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final Button kalkulacka = (Button) findViewById(R.id.kalkulacka);
        final Button zavody = (Button) findViewById(R.id.zavody);
        final Button prihlaseni = (Button) findViewById(R.id.prihlaseni);

        kalkulacka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kalkulackaIntent = new Intent(MenuActivity.this, CalculatorActivity.class);
                MenuActivity.this.startActivity(kalkulackaIntent);
            }
        });


    }
}
