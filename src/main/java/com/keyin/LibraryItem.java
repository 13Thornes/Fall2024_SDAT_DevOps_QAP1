package com.keyin;

/**
 * @author Samantha Throne
 * @version 1.00
 */
public class LibraryItem {
    /**
     * Represents the item id of the library item
     */
    private int itemID;
    /**
     * represents the title of the library item
     */
    private String title;
    /**
     * represents the author of the library item
     */
    private Author author;
    /**
     * represents the isbn of the library item
     */
    private String isbn;
    /**
     * represents the publisher of the library item
     */
    private String publisher;
    /**
     * represents the amount of copies of the library item
     */
    private int copyNum;
    /**
     * represents the amount of copies currently borrowed
     */
    private int borrowAmount = 0;



    /**
     * create a LibraryItem object
     * @param itemID accept the itemID and set it to the LibraryItem object
     * @param title accepts the title and set it to the LibraryItem object
     * @param author accepts the author and set it to the LibraryItem object
     * @param isbn accepts the isbn and set it to the LibraryItem object
     * @param publisher accepts the publisher and set it to the LibraryItem object
     * @param copyNum accepts the copyNum and set it to the LibraryItem object
     */
    public LibraryItem(int itemID, String title, Author author, String isbn, String publisher, int copyNum){
        this.itemID = itemID;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.copyNum = copyNum;
    }
    /**
     * Create a null LibraryItem object
     */
    public LibraryItem(){

    }
    // Getters and Setters

    /**
     *
     * @return returns the itemId of the LibraryItem object
     */
    public int getItemID() {
        return itemID;
    }

    /**
     *
     * @param itemID accepts itemID and set it to the LibraryItem object
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    /**
     *
     * @return returns the title of the LibraryItem object
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title accepts the title and set it to the LibraryItem object
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return returns author of the LibraryItem object
     */
    public Author getAuthor() {
        return author;
    }
    /**
     *
     * @param author accepts author and set it to the LibraryItem object
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     *
     * @return returns the isbn of the LibraryItem object
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     *
     * @param isbn accepts isbn and set it to the LibraryItem object
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     *
     * @return returns the publisher of the LibraryItem object
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     *
     * @param pub accepts publisher and set it to the LibraryItem Object
     */
    public void setPublisher(String pub) {
        this.publisher = pub;
    }

    /**
     *
     * @return returns the copyNum of the Literary object
     */
    public int getCopyNum() {
        return copyNum;
    }

    /**
     *
     * @param copyNum accept copyNum and set it to the LibraryItem object
     */
    public void setCopyNum(int copyNum) {
        this.copyNum = copyNum;
    }

    /**
     *
     * @return returns the borrowAmount of the LibraryItem object
     */
    public int getBorrowAmount() {
        return borrowAmount;
    }


    /**
     * @return returns the data of the LibraryItem object as a string
     */
    public String toString() {

        return ("Library Item[ID= " + itemID + ", Title= " + title + ", Author= " + author.getName() + ", ISBN= " + isbn + " Publisher= " + publisher + ", Copies= " + copyNum +"]");
    }

    // Borrow and Return book

    /**
     * Method to borrow the LibraryObject
     * @param p accepts a patron to add a book to the borrowedList
     */
    public void Borrow(Patron p) {

        if(borrowAmount == copyNum){
            System.out.println(title + " is currently unavailable");
        }

        else{

            p.addBorrowedItem(this);
            borrowAmount++;
        }
    }

    /**
     * method to return the LibraryItem object
     */
    public void Return() {

        if(borrowAmount == 0){
            System.out.println(" There are currently no copies borrowed");
        }
        else{
            borrowAmount--;
        }
    }

}

