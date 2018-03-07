package com.oquinn;

import java.util.*;

public class Main {
    public static class People {
        private String name;
        private String emails;

        private People (String name, String email) {
            this.name = name;
            this.emails = email;
        }
        public String recallEmail() {
            return this.emails;
        }
        public String recallName() {
            return this.name;
        }
    }
    public static class AddressBook {
        private Map<String, String> book = new TreeMap<>();

        public AddressBook (String name, String email) {
            this.book.put(name,email);
        }
        public void editContact (String name, String email) {
            this.book.put(name, email);
        }
        public Map<String, String> recallData () {
            return this.book;
        }
    }
    public static void main(String[] args) {
        People person1 = new People("Fake Dude 1", "person1@gmail.com");
        People person2 = new People("Fake Dude 2", "person2@gmail.com");
        People person3 = new People("Fake Dude 3", "person3@gmail.com");

        AddressBook addBk = new AddressBook(person1.recallName(), person1.recallEmail());
        addBk.editContact(person2.recallName(), person2.recallEmail());
        addBk.editContact(person3.recallName(), person3.recallEmail());

        for (String name : addBk.recallData().keySet()) {
            System.out.println(name + ": " + addBk.recallData().get(name));
        }
    }
}
