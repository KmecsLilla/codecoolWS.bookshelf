package com.codecool.bookshelf;

import com.codecool.bookshelf.model.books.HardcoverBook;
import com.codecool.bookshelf.model.books.PaperbackBook;

import java.util.stream.Collectors;

import static com.codecool.bookshelf.model.books.GenreType.*;

public class Main {
    public static void main(String[] args) {
        Bookshelf myBS = new Bookshelf();
        MyMockDatabase mockDb = new MyMockDatabase();
        myBS=mockDb.BookListOnShelf();

        System.out.println("Könyvespolcon lévő könyvek:\n---------------------------");
        myBS.printBooks();
        System.out.println("---------------------------");
        System.out.println("Legtöbb oldalas könyv:"+myBS.getAuthorOfMostWrittenPages());
        System.out.println("Legkönnyebb könyv:"+myBS.getLightestAuthor());

        myBS.getAllBooks().stream().filter(a -> a.getReleaseYear()==2004).forEach(a -> System.out.println(a.getAuthor()));
        System.out.println(myBS.getAllBooks().stream().map(n -> n.getAuthor()).collect(Collectors.toList()).toString());
    }
}
