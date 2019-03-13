package br.edu.iftm.lltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

import br.edu.iftm.lltest.model.Person;

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
        setContentView(R.layout.show_person_activity);

        txtFNR = (TextView) findViewById(R.id.txtFNR);
        txtLNR = (TextView) findViewById(R.id.txtLNR);
        txtAGE = (TextView) findViewById(R.id.txtAR);
        txtSR = (TextView) findViewById(R.id.txtSSNR);
        txtER = (TextView) findViewById(R.id.txtER);
        Person person = getIntent().getParcelableExtra(MainActivity.PERSON_KEY);

        txtFNR.setText(person.getFirstName());
        txtLNR.setText(person.getLastName());
        txtSR.setText(person.getSsn());
        txtAR.setText(""+ person.getAge());
        txtER.setText(person.getEmail());
    }
}
