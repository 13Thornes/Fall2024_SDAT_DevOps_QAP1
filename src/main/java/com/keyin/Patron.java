package com.keyin;

import java.util.ArrayList;
/**
 * @author Samantha Throne
 * @version 1.00
 */
public class Patron {
    /**
     * represents the ID of the patron
     */
    private int patronID;
    /**
     * represents the name of the patron
     */
    private String name;
    /**
     * represents the address of the patron
     */
    private String address;
    /**
     * represents the phone number of the patron
     */
    private String phoneNum;
    /**
     * represents a list of all the library items the patron has borrowed
     */
    public ArrayList<LibraryItem> borrowedList = new ArrayList<LibraryItem>();

    /**
     * create a Patron Object
     * @param patronID accepts patronID and set it to the Patron object
     * @param name accepts the name and set it to the Patron Object
     * @param address accepts the address and set it to the Patron object
     * @param phoneNum accepts the phoneNum and set it to the Patron object
     */
    public Patron(int patronID, String name, String address, String phoneNum) {
        this.patronID = patronID;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    /**
     * create a null Patron object
     */
    public Patron(){

    }
    /**
     * create a Patron Object
     * @param patronID accepts patronID and set it to the Patron object
     * @param name accepts the name and set it to the Patron Object
     * @param address accepts the address and set it to the Patron object
     * @param phoneNum accepts the phoneNum and set it to the Patron object
     * @param item accepts the item and set it o the Patron object
     */
    public Patron(int patronID, String name, String address, String phoneNum, LibraryItem item) {
        this.patronID = patronID;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        borrowedList.add(item);
    }

    /**
     *
     * @return returns the patronID of the Patron object
     */
    public int getPatronID() {
        return patronID;
    }

    /**
     *
     * @param patronID accepts patronID and set it to the Patron object
     */
    public void setPatronID(int patronID) {
        this.patronID = patronID;
    }

    /**
     *
     * @return returns name of the Patron object
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name accepts name and set it to the Patron object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return returns address of the Patron object
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address accepts address and set it to the Patron object
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return returns the phoneNum of the Patron object
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     *
     * @param phoneNum accepts phoneNum and set it to the Patron Object
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     *
     * @return returns borrowedList of the Patron object
     */
    public ArrayList<LibraryItem> getBorrowedList() {
        return borrowedList;
    }

    /**
     *
     * @param item accepts borrowedList and set it to the Patron object
     */
    public void setBorrowedList(ArrayList<LibraryItem> item) {
        borrowedList = item;
    }

    // Add/remove book from WrittenList

    /**
     * method to add a borrowed item to the borrowedItem list
     * @param i accepts LibraryItem i and adds it to borrowedList
     */
    public void addBorrowedItem(LibraryItem i) {

        borrowedList.add(i);
        System.out.println("Item added to list");

    }

    /**
     * method to remove a borrowed library item
     * @param i accepts LibraryItem i and removes it from borrowedList
     */
    public boolean removeBorrowedItem(LibraryItem i) {
        if (this.borrowedList.contains(i)) {
            borrowedList.remove(i);
            System.out.println("Item removed from list");
            return true;
        } else {
            return false;
        }

    }



    /**
     * @return returns all the data of the Patron object as a string
     */
    public String toString() {
        return "Patron " + patronID + "[Name= " + this.name + ", Address= " + this.address + ", Phone No.= " + phoneNum + ", Items Borrowed: " + this.borrowedList.toString();

    }

}

