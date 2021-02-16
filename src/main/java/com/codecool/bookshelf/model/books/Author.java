package com.codecool.bookshelf.model.books;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class Author {
    private final long id;
    private final String name;
    private final Date birthDate;
    private List<Book> bibliography;

    public Author(long id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;

    }



    public void addBookToBibliography(Book book){
        bibliography.add(book);
    }
}
