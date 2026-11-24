package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //list to hold the persons.
        List<Person> myFamily = new ArrayList<Person>();

        //Add and Create new person.
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );
        myFamily.add( new Person("Aria", "Aiden", 17) );

        //Sort the list
        Collections.sort(myFamily);

        //for loop to loop through each person and sout the first and last name.
        for (Person person : myFamily) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}