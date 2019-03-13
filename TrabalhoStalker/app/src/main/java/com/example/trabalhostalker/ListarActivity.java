package com.example.trabalhostalker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListarActivity extends AppCompatActivity {
    private LinearLayout lnvPeopleList;
    public static final String PERSON_KEY = "com.example.trabalhostalker.MainActivity.PERSON";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
/* Estas pessoas só são criadas caso seja chamada a lista e ela esteja nula*/
        lnvPeopleList=(LinearLayout) findViewById(R.id.lnvPeopleList);
        if(DAOPerson.getINSTANCE().getPeople() == null || DAOPerson.getINSTANCE().getPeople().isEmpty() ){
            Person p1 = new Person("FulanoA","silva","estudante","9845621","7","17/12/2000",32);
            Person p2 = new Person("FulanoB","ferreira","estudante","465131","6","08/12/2000",52);

            DAOPerson.getINSTANCE().addPerson(p1);
            DAOPerson.getINSTANCE().addPerson(p2);

        }

        this.createList();
    }

    private void createList() {
        for(final Person person: DAOPerson.getINSTANCE().getPeople()){
            LinearLayout lnvPersonResume = (LinearLayout) getLayoutInflater().inflate(R.layout.person_resume,null);

            TextView txtFirstName = lnvPersonResume.findViewById(R.id.txtFirstName);
            txtFirstName.setText(person.getFirstName());
            TextView txtjob = lnvPersonResume.findViewById(R.id.txtJob);
            txtjob.setText(person.getJob());
            TextView txtAge = lnvPersonResume.findViewById(R.id.txtAge);
            txtAge.setText(Integer.toString(person.getAge()));

            lnvPersonResume.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getBaseContext(), ShowPersonActivity.class);
                    intent.putExtra(PERSON_KEY,person);
                    startActivity(intent);

                }
            });
            lnvPeopleList.addView(lnvPersonResume);
        }
    }
                }
