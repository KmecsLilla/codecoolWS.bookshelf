package com.codecool.bookshelf;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookShelfTest {

    Bookshelf bookshelf;

    @BeforeEach
    void setup(){
        bookshelf = new Bookshelf();
    }

    @Test
    public void getBooksTestSort(){
        assertThrows(NoSuchElementException.class,bookshelf::getLightestAuthor,"No such element");
    }

    @Test
    public void getBooksTest(){
        NoSuchElementException thrown = assertThrows(
                NoSuchElementException.class,
                bookshelf::getLightestAuthor,
                "No such element"
        );
        assertTrue(thrown.getMessage().contains("No"));
    }
}
