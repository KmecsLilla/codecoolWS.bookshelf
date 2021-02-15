package com.codecool.bookshelf.model.books;

import java.util.Date;
import java.util.List;

public class Author {
    private static long idc=0;
    private final long id;
    private final String name;
    private final Date birthDate;
    private List<Book> bibliography;

    public Author(String name, Date birthDate, List<Book> bibliography) {
        this.name = name;
        this.birthDate = birthDate;
        this.bibliography = bibliography;
        this.id = idc++;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBibliography(List<Book> bibliography) {
        this.bibliography = bibliography;
    }

    public List<Book> getBibliography() {
        return bibliography;
    }

    public void add(Book book){
        bibliography.add(book);
    }
}
