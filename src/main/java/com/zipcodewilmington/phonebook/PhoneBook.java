package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this(new HashMap<>());
    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name, Arrays.asList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, Arrays.asList(phoneNumbers));

    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {
        if (phonebook.containsKey(name)) {
            return true;
        }
        return false;
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
        // Return a name with the name with the input of a phone number
    }

    public List<String> getAllContactNames() {
        return null;
        // Return list of names from the entire phone book
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}
