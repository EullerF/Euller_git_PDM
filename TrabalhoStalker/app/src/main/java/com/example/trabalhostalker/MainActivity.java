package com.example.trabalhostalker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
    public void onClick(View v)
    {
        Intent intent = new Intent(getBaseContext(), CriarActivity.class);
        startActivity(intent);
    }
    public void onClick2(View v)
    {
        Intent intent = new Intent(getBaseContext(), ListarActivity.class);
        startActivity(intent);
    }
    }

