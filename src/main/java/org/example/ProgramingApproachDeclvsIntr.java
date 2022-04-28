package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramingApproachDeclvsIntr {

    static class Address {

        private String address;
        private String state;
        private String zipCode;

        public Address(String address, String state, String zipCode) {
            this.address = address;
            this.state = state;
            this.zipCode = zipCode;
        }

      @Override
        public String toString() {
            return "Address{" +
                    "address='" + address + '\'' +
                    ", state='" + state + '\'' +
                    ", zipCode='" + zipCode + '\'' +
                    '}';
        }

        public String getAddress() {
            return address;
        }

        public String getState() {
            return state;
        }

        public String getZipCode() {
            return zipCode;
        }
    }


    static class Person {

        private String gender;
        private String name;
        private int age;
        private Address address;

        public Person(String gender, String name, int age, Address address) {
            this.gender = gender;
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            String s = "Person{" +
                    "gender='" + gender + '\'' +
                    ", name='" + name + '\'' +
                    age +
                    "address='" + address;
            String s1 = s;
            return s1;
        }
    }

    public static void main(String args[]) {

        Address address = new Address("test addr", "NY", "345456");
        Address address1 = new Address("test addr1", "NY", "345456");
        Address address2 = new Address("test addr2", "NY", "345456");
        Address address3 = new Address("test addr3", "NY", "345456");

        List<Person> person = List.of(new ProgramingApproachDeclvsIntr.Person("FEMALE", "APARNA", 28, address),
                new ProgramingApproachDeclvsIntr.Person("MALE", "SAURAV", 32, address1),
                new ProgramingApproachDeclvsIntr.Person("FEMALE", "MANJU", 42, address2),
                new ProgramingApproachDeclvsIntr.Person("MALE", "AMIT", 54, address3));


        //Imperative
        //loop to take out females from the list of persons
        List<Person> personfemale = new ArrayList<>();

        System.out.println("Imperative programing");
        for (Person p : person) { //
            if ("FEMALE".equalsIgnoreCase(p.gender)) //
                personfemale.add(p);
        }
        //loop to print females stored
        for (Person p : personfemale) {
            System.out.println(p);
        }


        //Declarative
        System.out.println("Declarative programing");
        person.stream().filter(i -> "FEMALE".equalsIgnoreCase(i.gender)).collect(Collectors.toList()).forEach(System.out::println);


    }
}


