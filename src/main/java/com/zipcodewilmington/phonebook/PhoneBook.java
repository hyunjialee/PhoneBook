package com.zipcodewilmington.phonebook;

import java.util.*;
import java.util.HashMap;


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
        this(new LinkedHashMap<>());
        //Needs to be a linked hash map for the entry order
        // Regular hash map is RANDOM, it does not keep order
        // TreeMap is ascending order  A -> Z or 1 -> 10
    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name, Arrays.asList(phoneNumber));

        // Map <Key, Value>
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

    public String reverseLookup(String phoneNumber) {
        String name = ""; // Empty string to hold the place of the name

        for (Map.Entry<String, List<String>> number : phonebook.entrySet()) {
            // For each loop that iterates over phonebook MAP.
            // Map.Entry<String, List<String>> represents an entry in the map where key is a STRING
            // ^^^^^ KEY - VALUE pair ^^^^^
            // and the value is a List<String>
            // phonebook.entrySet gets all entries in phonebook MAP
            if (number.getValue().contains(phoneNumber)) {
                name = number.getKey();
                break;
            }
        }
        return name;
        // What is needed: keyset equal to the number to the name
        // Return a name with the name with the input of a phone number
    }

    public List<String> getAllContactNames() {
        //All the names are key sets in this HashMap || KEYSET( GIVES NAMES)|| VALUES (GIVES NUMBER)
        // Needs to be in order of the entries ...




//        return List.copyOf(phonebook.keySet()); Incorrect method

        return new ArrayList<>(phonebook.keySet());


        // for each string -> loop through the List
        // Return list of names from the entire phone book
        // Need to get the list of names from the phonebook.
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}
