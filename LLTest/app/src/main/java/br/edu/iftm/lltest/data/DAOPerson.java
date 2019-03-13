package br.edu.iftm.lltest.data;

import java.util.ArrayList;

import br.edu.iftm.lltest.model.Person;

public class DAOPerson {
    private static DAOPerson INSTANCE;
    private ArrayList<Person> people;

    private DAOPerson() {
        people = new ArrayList<>();
    }

    public static DAOPerson getINSTANCE() {
        if(INSTANCE == null)
            INSTANCE = new DAOPerson();
        return INSTANCE;
    }

    public ArrayList<Person> getPeople(){
        return people;
    }

    public void addPerson(Person person){
        people.add(person);
    }
}