package com.pluralsight;

public class Person implements  Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    //Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Getter and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Method to compare List.
    @Override
    public int compareTo(Person person) {

        //Checks if the last name is same or not.
        if(this.getLastName().equals(person.getLastName())){

            //if the last name matches then it will sort by the first name.
            return this.getFirstName().compareTo(person.getFirstName());
        }
        else{
            //else just sort by last name.
            return this.getLastName().compareTo(person.getLastName());
        }
    }
}