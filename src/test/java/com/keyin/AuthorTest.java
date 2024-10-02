package com.keyin;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {
    @test
    public void testAddWrittenItem() {
        Author testAuthor = new Author("JohnDoe", "1987/12/11");
        Book testBook = new Book(150, "Secret Garden", testAuthor, "A6H9G7", "Greenwood", 5, "P", "Romance");

        Assertions.assertTrue(testAuthor.addWrittenItem(testBook));
    }


}
