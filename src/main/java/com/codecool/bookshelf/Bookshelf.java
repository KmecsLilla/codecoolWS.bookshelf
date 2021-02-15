package com.codecool.bookshelf;

import com.codecool.bookshelf.model.books.Book;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Bookshelf {
    List<Book> shelf = new LinkedList<>();

    public Bookshelf() {
    }

    public Bookshelf(List<Book> shelf) {
        this.shelf = shelf;
    }

    public void addBook(Book book){
        shelf.add(book);
    }

    public List<Book> getBooks(int year){
        return shelf.stream().filter(item -> item.getReleaseYear() == year ).collect(Collectors.toList());
    }

    public List<Book> getAllBooks(){
        return shelf;
    }

    public String getLightestAuthor(){
        return shelf.stream().min(Comparator.comparing(Book::getWeightInGram)).get().getBookInfo();
    }

    public void printBooks(){
        for (Book book : shelf) {
            System.out.println(book.getBookInfo());
        }
    }

    public String getAuthorOfMostWrittenPages(){
        return shelf.stream().max(Comparator.comparing(Book::getNumberOfPages)).get().getBookInfo();
    }
}
