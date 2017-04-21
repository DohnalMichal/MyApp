package com.example.dohny.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText prezdivka = (EditText) findViewById(R.id.prezdivka);
        final EditText heslo = (EditText) findViewById(R.id.heslo);
        final Button prihlaseni = (Button) findViewById(R.id.prihlaseni);
        final Button registrace = (Button) findViewById(R.id.registrace);

        registrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registraceIntent = new Intent(MainActivity.this, RegisterActivity.class);
                MainActivity.this.startActivity(registraceIntent);
            }
        });

        prihlaseni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prihlaseniIntent = new Intent(MainActivity.this, MenuActivity.class);
                MainActivity.this.startActivity(prihlaseniIntent);
            }
        });
    }
}
