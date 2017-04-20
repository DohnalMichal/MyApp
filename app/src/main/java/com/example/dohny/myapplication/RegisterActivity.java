package com.example.dohny.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText jmneno = (EditText) findViewById(R.id.jmeno);
        final EditText prezdivka = (EditText) findViewById(R.id.prezdivka);
        final EditText heslo = (EditText) findViewById(R.id.heslo);
        final EditText vek = (EditText) findViewById(R.id.vek);
        final EditText vyska = (EditText) findViewById(R.id.vyska);
        final EditText vaha = (EditText) findViewById(R.id.vaha);
        final Button registrace = (Button) findViewById(R.id.registrace);

        registrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registraceIntent = new Intent(RegisterActivity.this, MainActivity.class);
                RegisterActivity.this.startActivity(registraceIntent);
            }
        });
    }
}
