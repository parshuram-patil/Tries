package com.cs.Venkat_Lambdas.a13_grouping_and_mapping;

import com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Gender;
import com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person;

import java.util.*;
import java.util.function.Consumer;

import static java.util.stream.Collectors.*;

public class Sample {
    public static List<com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person> createPeople() {
        return Arrays.asList(
                new com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person("Sara", com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Gender.FEMALE, 20),
                new com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person("Sara", com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Gender.FEMALE, 22),
                new com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person("Bob", com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Gender.MALE, 20),
                new com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person("Paula", com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Gender.FEMALE, 32),
                new com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person("Paul", com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Gender.MALE, 32),
                new com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person("Jack", com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Gender.MALE, 2),
                new com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person("Jack", com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Gender.MALE, 72),
                new com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person("Jill", Gender.FEMALE, 12)
        );
    }

    public static void main(String[] args) {
        List<com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person> people = createPeople();

        //given a list of people, create a map where
        //their name is the key and value is all the ages of people with that name

        System.out.println(
                people.stream()
                        .collect(groupingBy(com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Person::getName,
                                mapping(Person::getAge, toList()))));
    }
}