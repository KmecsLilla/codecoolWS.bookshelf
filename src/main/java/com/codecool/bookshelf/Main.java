package com.codecool.bookshelf;

import com.codecool.bookshelf.model.books.HardcoverBook;
import com.codecool.bookshelf.model.books.PaperbackBook;

import java.util.stream.Collectors;

import static com.codecool.bookshelf.model.books.GenreType.*;

public class Main {
    public static void main(String[] args) {
        Bookshelf myBS = new Bookshelf();
        myBS.addBook(new HardcoverBook(1,"Felhőatlasz","David Mitchell",2004,200, SCIFI));
        myBS.addBook(new HardcoverBook(2,"Összeesküvés Amerika ellen","Philip Roth",2004,250,DRAMA));
        myBS.addBook(new PaperbackBook(3,"Szellemírók","David Mitchell",1999,300,SCIFI));
        myBS.addBook(new PaperbackBook(4,"Csontórák","David Mitchell",2014,100,DRAMA));
        myBS.addBook(new HardcoverBook(5,"A kutya különös esete az éjszakában","Mark Haddon",2003,220,FANTASY));
        myBS.addBook(new HardcoverBook(6,"The Red House","Mark Haddon",2012,230,FICTION));
        myBS.addBook(new PaperbackBook(7,"Pi élete","Yann Martel",2001,330,DRAMA));
        myBS.addBook(new PaperbackBook(8,"Beatrice and Virgil","Yann Martel",2014,100,DRAMA));
        System.out.println("Könyvespolcon lévő könyvek:\n---------------------------");
        myBS.printBooks();
        System.out.println("---------------------------");
        System.out.println("Legtöbb oldalas könyv:"+myBS.getAuthorOfMostWrittenPages());
        System.out.println("Legkönnyebb könyv:"+myBS.getLightestAuthor());

        myBS.getAllBooks().stream().filter(a -> a.getReleaseYear()==2004).forEach(a -> System.out.println(a.getAuthor()));
        System.out.println(myBS.getAllBooks().stream().map(n -> n.getAuthor()).collect(Collectors.toList()).toString());
    }
}
