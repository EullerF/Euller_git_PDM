package br.edu.iftm.lltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import br.edu.iftm.lltest.data.DAOPerson;
import br.edu.iftm.lltest.model.Person;

public class MainActivity extends AppCompatActivity {

    public static final String PERSON_KEY = "br.edu.iftm.lltest.MainActivity.PERSON";
    private LinearLayout lnvPeopleList;
    //private Toast infoToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lnvPeopleList=(LinearLayout) findViewById(R.id.lnvPeopleList);

        Person p1 = new Person("FulanoA","Silvo","11111111111","fulano@bol.com.br",17);
        Person p2 = new Person("FulanoB","Silva","11111111111","fulano@bol.com.br",17);
        Person p3 = new Person("FulanoC","Silve","11111111111","fulano@bol.com.br",17);
        Person p4 = new Person("FulanoD","Silvx","11111111111","fulano@bol.com.br",17);
        Person p5 = new Person("FulanoE","Silv1","11111111111","fulano@bol.com.br",17);
        Person p6 = new Person("FulanoF","Silv3","11111111111","fulano@bol.com.br",17);
        Person p7 = new Person("Fulano7","Silvas","11111111111","fulano@bol.com.br",17);

        DAOPerson.getINSTANCE().addPerson(p1);
        DAOPerson.getINSTANCE().addPerson(p2);
        DAOPerson.getINSTANCE().addPerson(p3);
        DAOPerson.getINSTANCE().addPerson(p4);
        DAOPerson.getINSTANCE().addPerson(p5);
        DAOPerson.getINSTANCE().addPerson(p6);
        DAOPerson.getINSTANCE().addPerson(p7);

        this.createList();
    }

    public  void createList(){
        for(final Person person: DAOPerson.getINSTANCE().getPeople()){
            LinearLayout lnvPersonResume = (LinearLayout) getLayoutInflater().inflate(R.layout.person_resume,null);

            TextView txtFirstName = lnvPersonResume.findViewById(R.id.txtFirstName);
            txtFirstName.setText(person.getFirstName());
            TextView txtSSN = lnvPersonResume.findViewById(R.id.txtSSN);
            txtSSN.setText(person.getSsn());
            TextView txtAge = lnvPersonResume.findViewById(R.id.txtAge);
            txtAge.setText(Integer.toString(person.getAge()));

           lnvPersonResume.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

//                   if(infoToast != null)
//                   infoToast.cancel();
//                   infoToast = Toast.makeText(getBaseContext(), person.getFirstName()+ " "+person.getLastName(), Toast.LENGTH_SHORT);
//                   infoToast.show();
                    Intent intent = new Intent(getBaseContext(), ShowPersonActivity.class);
                    intent.putExtra(PERSON_KEY,person);
                    startActivity(intent);

                }
            });
            lnvPeopleList.addView(lnvPersonResume);
        }
    }
}
