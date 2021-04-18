package com.cs.Venkat_Lambdas.a15_lazy_at_work;

import com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Gender;

public class Person {
  private final String name;
  private final com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Gender gender;
  private final int age;
  
  public Person(String theName, com.cs.Venkat_Lambdas.a17_changing_a_property_to_sorted.Gender theGender, int theAge) {
    name = theName;
    gender = theGender;
    age = theAge;
  }
  
  public String getName() { 
    return name; 
  }
  public int getAge() { 
    return age; 
  }
  public Gender getGender() { return gender; }
  
  public String toString() {
    return String.format("%s -- %s -- %d", name, gender, age);
  }  
}