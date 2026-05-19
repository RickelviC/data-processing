package com.pluralsight.streams;

import com.pluralsight.Person;

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

        people.add(new Person("Katrina", "Ross", 24));
        people.add(new Person("Madge", "Velazquez", 19));
        people.add(new Person("Kelvin", "Bryan", 34));
        people.add(new Person("Wm", "Kelvin", 51));
        people.add(new Person("Dave", "Knox", 72));
        people.add(new Person("Ruben", "Davila", 4));
        people.add(new Person("Jasmine", "Sparks", 42));
        people.add(new Person("Esmeralda", "Nolan", 23));
        people.add(new Person("Vonda", "Riley", 81));
        people.add(new Person("Kristofer", "Wilkinson", 38));

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
