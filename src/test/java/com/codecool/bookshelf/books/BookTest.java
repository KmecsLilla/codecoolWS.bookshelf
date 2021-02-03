package com.codecool.bookshelf.books;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    Book book;

//    @AfterAll

//    @BeforeAll

    @BeforeEach
    void setup(){
        book = new Book("Felhőatlasz","David Mitchell",2004,200,100);
    }

    @Test
    public void getReleaseYearTest(){
        assertEquals(2004, book.getReleaseYear());
    }

}
