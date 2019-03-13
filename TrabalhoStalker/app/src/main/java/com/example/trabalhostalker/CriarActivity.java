package com.example.trabalhostalker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CriarActivity extends AppCompatActivity {
    private LinearLayout lnvPeopleList;
    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        editText7 = (EditText) findViewById(R.id.editText7);

    }
    public void onClick3(View v)
    {
        Person p = new Person(editText.getText().toString(),editText2.getText().toString(),editText4.getText().toString(),editText6.getText().toString(),editText7.getText().toString(),editText5.getText().toString(),Integer.parseInt(editText3.getText().toString()));
        DAOPerson.getINSTANCE().addPerson(p);
        finish();
    }
}
