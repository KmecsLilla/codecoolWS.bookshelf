package com.codecool.bookshelf.books;

import com.codecool.bookshelf.model.books.Book;
import com.codecool.bookshelf.model.books.GenreType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    Book book;

//    @AfterAll

//    @BeforeAll

    @BeforeEach
    void setup(){
        book = new Book("Felhőatlasz","David Mitchell",2004,200,100, GenreType.SCIFI);
    }

    @Test
    public void getReleaseYearTest(){
        assertEquals(2004, book.getReleaseYear());
    }

}
