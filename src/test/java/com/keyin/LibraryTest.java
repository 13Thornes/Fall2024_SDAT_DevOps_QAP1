package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void testBookListContains() {
        Author testAuthor = new Author("JohnDoe", "1987/12/11");
        Book testBook1 = new Book(150, "Secret Garden", testAuthor,"A6H9G3", "Greenwood", 5, "P", "Romance");
        Book testBook2 = new Book(151, "Go Dog Go", testAuthor,"A6H9G4", "Greenwood", 3, "E", "Children");
        Book testBook3 = new Book(152, "Highway", testAuthor,"A6H9G5", "Greenwood", 4, "A", "Biography");
        Library testLibrary = new Library();
        testLibrary.addBook(testBook1);
        testLibrary.addBook(testBook2);
        testLibrary.addBook(testBook3);
        Assertions.assertNotNull(testLibrary.getBookList());
    }
}
