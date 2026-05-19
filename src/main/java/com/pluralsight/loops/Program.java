package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

         List<Person> people = new ArrayList<>();
         List<Person> searchedPeople = new ArrayList<>();

        makePerson(people);

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the name you want to search for: ");
        String nameSearched = scanner.nextLine();

        searchPerson(people,searchedPeople,nameSearched);

        scanner.close();
    }

    public static void makePerson(List<Person> people) {

        Person person1 = new Person("Katrina", "Ross", 24);
        Person person2 = new Person("Madge", "Velazquez", 24);
        Person person3 = new Person("Kelvin", "Bryan", 24);
        Person person4 = new Person("Wm", "Merritt", 24);
        Person person5 = new Person("Dave", "Knox", 24);
        Person person6 = new Person("Ruben", "Davila", 24);
        Person person7 = new Person("Jasmine", "Sparks", 24);
        Person person8 = new Person("Esmeralda", "Nolan", 24);
        Person person9 = new Person("Vonda", "Riley", 24);
        Person person10 = new Person("Kristofer", "Wilkinson", 24);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);
    }

    public static void searchPerson(List<Person> people, List<Person> searchedPeople, String nameSearched){

        for (Person person : people) {
            if (nameSearched.equalsIgnoreCase(person.getFirstName()) || nameSearched.equalsIgnoreCase(person.getLastName())) {
                searchedPeople.add(person);
            }
        }
        for (Person searchedPerson : searchedPeople) {
            System.out.println(searchedPerson);
        }
    }
}
