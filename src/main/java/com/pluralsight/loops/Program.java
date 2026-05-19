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

        searchPerson(people, searchedPeople, nameSearched);

        ageAverage(people);

        findOldestAge(people);

        findYoungestAge(people);

        scanner.close();
    }

    public static void makePerson(List<Person> people) {

        Person person1 = new Person("Katrina", "Ross", 24);
        Person person2 = new Person("Madge", "Velazquez", 19);
        Person person3 = new Person("Kelvin", "Bryan", 34);
        Person person4 = new Person("Wm", "Kelvin", 51);
        Person person5 = new Person("Dave", "Knox", 72);
        Person person6 = new Person("Ruben", "Davila", 4);
        Person person7 = new Person("Jasmine", "Sparks", 42);
        Person person8 = new Person("Esmeralda", "Nolan", 23);
        Person person9 = new Person("Vonda", "Riley", 81);
        Person person10 = new Person("Kristofer", "Wilkinson", 38);

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

    public static void searchPerson(List<Person> people, List<Person> searchedPeople, String nameSearched) {

        for (Person person : people) {
            if (nameSearched.equalsIgnoreCase(person.getFirstName()) ||
                    nameSearched.equalsIgnoreCase(person.getLastName())) {
                searchedPeople.add(person);
            }
        }
        for (Person searchedPerson : searchedPeople) {
            System.out.println(searchedPerson);
        }
    }

    public static void ageAverage(List<Person> people) {
        double ageAverage = 0;
        int ageTotal = 0;
        int counter = 0;
        for (Person person : people) {
            counter++;
            ageTotal += person.getAge();
        }
        ageAverage = (double) ageTotal / counter;

        System.out.println("average age is: " + ageAverage);
    }

    private static void findOldestAge(List<Person> people) {
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        System.out.println("the oldest age is: " + maxAge);
    }

    private static void findYoungestAge(List<Person> people) {
        int maxAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < maxAge) {
                maxAge = person.getAge();
            }
        }
        System.out.println("the Youngest age is: " + maxAge);
    }
}
