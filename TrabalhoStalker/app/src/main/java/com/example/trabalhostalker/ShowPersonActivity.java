package com.example.trabalhostalker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowPersonActivity extends AppCompatActivity {

    private TextView txtFNR;
    private TextView txtLNR;
    private TextView txtJJOB;
    private TextView txtAGE;
    private TextView txtPHO;
    private TextView txtB;
    private TextView txtDESC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_person);
        txtFNR = (TextView) findViewById(R.id.txtFNR);
        txtLNR = (TextView) findViewById(R.id.txtLNR);
        txtAGE = (TextView) findViewById(R.id.txtAGE);
        txtJJOB = (TextView) findViewById(R.id.txtJJOB);
        txtPHO = (TextView) findViewById(R.id.txtPHO);
        txtB = (TextView) findViewById(R.id.txtB);
        txtDESC = (TextView) findViewById(R.id.txtDESC);

        Person person = getIntent().getParcelableExtra(ListarActivity.PERSON_KEY);

        txtFNR.setText(person.getFirstName());
        txtLNR.setText(person.getLastName());
        txtJJOB.setText(person.getJob());
        txtAGE.setText(""+ person.getAge());
        txtPHO.setText(person.getPhone());
        txtB.setText(person.getBirftdhay());
        txtDESC.setText(person.getDescription());
    }
}
