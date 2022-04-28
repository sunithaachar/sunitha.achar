package org.example;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramingApproachDeclvsIntr{

    static class Person{

        private String name;
        private String gender;
        private int age;

        public Person(String gender, String name) {
            this.gender = gender;
            this.name = name;
        }
        public Person(String name, String gender, int age){
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "gender='" + gender + '\'' +
                    ", name='" + name + '\'' +
                    ", age = " + age +
                    '}';
        }
    }



    public static void main(String args[]){
       List<Person> person=List.of(new ProgramingApproachDeclvsIntr.Person("MALE","SAURAV"),
                new ProgramingApproachDeclvsIntr.Person("FEMALE","SITA"),
                new ProgramingApproachDeclvsIntr.Person("FEMALE","RENU"),
               new ProgramingApproachDeclvsIntr.Person("MALE","LAXMANA"),
               new ProgramingApproachDeclvsIntr.Person("MALE","RAM"));


       //Imperative
        //loop to take out females from the list of persons
        List<Person> personfemale=new ArrayList<>();
        List<Person> personmale=new ArrayList<>();
        System.out.println("Imperative programing");
        for(Person p:person){ //
            if("FEMALE".equalsIgnoreCase(p.gender)) //
            personfemale.add(p);
        }
        //loop to print females stored
        for(Person p:personfemale){
            System.out.println(p);
        }

        for(Person p:person){ //
            if("MALE".equalsIgnoreCase(p.gender)) //
                personmale.add(p);
        }

        // loop to print males stored

        for(Person p:personmale){
            System.out.println(p);
        }


        //Declarative
        System.out.println("Declarative programing");
        person.stream().filter(i-> "FEMALE".equalsIgnoreCase(i.gender)).collect(Collectors.toList()).forEach(System.out::println);
        person.stream().filter(i-> "MALE".equalsIgnoreCase(i.gender)).collect(Collectors.toList()).forEach(System.out::println);

    }
}


