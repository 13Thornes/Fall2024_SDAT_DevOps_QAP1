package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatronTest {
    @Test
    public void testRemoveBorrowedItem() {
        Student testStudent = new Student(790, "JaneSmith", "543NorthSt", "7986572453", 145, "Herman", 12);
        Author testAuthor = new Author("JohnDoe", "1987/12/11");
        Book testBook = new Book(150, "Secret Garden", testAuthor, "A6H9G7", "Greenwood", 5, "P", "Romance");

        Assertions.assertFalse(testStudent.removeBorrowedItem(testBook));
    }
}
