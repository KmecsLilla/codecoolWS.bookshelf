package com.codecool.bookshelf.dao;

import com.codecool.bookshelf.model.books.Author;
import com.codecool.bookshelf.model.books.Book;

import java.util.List;

public interface BookShelfDao {
    public void addBook(Book book);
    public Book findById(long id);
    public Book findByTitle(String title);
    public List<Book> findBooksByAuthor(Author author);
}
