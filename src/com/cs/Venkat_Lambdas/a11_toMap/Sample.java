package com.cs.Venkat_Lambdas.a11_toMap;

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
    List<Person> people = createPeople();
    
    //create a Map with name and age as key, and the person as value.
    
    System.out.println(
      people.stream()
            .collect(toMap(
              person -> person.getName() + "-" + person.getAge(),
              person -> person)));
  }
}