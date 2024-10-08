package com.keyin;

// Project: Sprint 1 Java, Library System
// Author: Luke Peddle, Micheal Walsh, Samantha Thorne
// Date: June 18-? 2024

// Import required library
import java.util.ArrayList;

/**
 * @author Samantha Throne
 * @version 1.00
 */
public class Author {
    // Initialize variables

    /**
     * represents the name of the author
     */
    private String name;
    /*
     * Represents the Date of birth of the author
     */
    private String DOB;

    /*
    Stores all the books the author has created */
    private ArrayList<LibraryItem> writtenList = new ArrayList<LibraryItem>();

    /**
     *
     * @param n Accepts the name of the author and set it to the Author object
     * @param d Accepts the date of birth of the author and set it to the author object
     */
    // Create constructors
    public Author(String n, String d) {
        this.name = n;
        this.DOB = d;
    }


    public Author() {

    }

    /**
     *
     * @param n Accepts the name of the author and set it to the Author object
     * @param d Accepts the date of birth of the author and set it to the Author object
     * @param bt Accepts a list of the books the author has written and set it to the Author object
     */
    public Author(String n, String d, LibraryItem bt) {
        this.name = n;
        this.DOB = d;
        writtenList.add(bt);

    }

    // Getters and Setters

    /**
     *
     * @return returns the authors name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param n accepts the name of the author and set it to the Author object
     */
    public void setName(String n) {
        this.name = n;
    }

    /**
     *
     * @return returns the date of birth of the author
     */
    public String getDOB() {
        return DOB;
    }

    /**
     *
     * @param d accepts the date of birth of the author and set it to the Author class
     */
    public void setDOB(String d) {
        this.DOB = d;
    }

    /**
     *
     * @return returns a list of all the library items the author has written
     */
    public ArrayList<LibraryItem> getWrittenList() {
        return writtenList;
    }

    /**
     *
     * @param i accepts a list of library items and set it to the Author object
     */
    public void setWrittenList(LibraryItem i) {
        writtenList.add(i);
    }

    // Add/remove book from WrittenList

    /**
     * Add a library item to the Author class
     * @param i accepts a library item and adds it to the Author object
     */
    public boolean addWrittenItem(LibraryItem i) {
        if (this.writtenList.contains(i)) {
            System.out.println("Item already in list");
            return false;
        } else {
            writtenList.add(i);
            System.out.println("Item added to list");
            return true;
        }
    }

    /**
     * removes a library item from the Author class
     * @param i accepts a library item and removes it from the Author object
     */
    public void removeWrittenItem(LibraryItem i) {
        if (this.writtenList.contains(i)) {
            writtenList.remove(i);
            System.out.println("Item removed from list");
        }

    }

    // toString()
    /**
     * @return Returns all the data in the Author object as a string
     */
    public String toString() {
        return "Name: " + this.name + ", DOB: " + this.DOB + ", Works: " + this.writtenList.toString();

    }

}

