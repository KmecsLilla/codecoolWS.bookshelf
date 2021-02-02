package com.codecool.bookshelf;

public class Main {
    public static void main(String[] args) {
        Bookshelf myBS = new Bookshelf();
        myBS.addBook(new HardcoverBook("Felhőatlasz","David Mitchell",2004,200));
        myBS.addBook(new HardcoverBook("Összeesküvés Amerika ellen","Philip Roth",2004,250));
        myBS.addBook(new PaperbackBook("Szellemírók","David Mitchell",1999,300));
        myBS.addBook(new PaperbackBook("Csontórák","David Mitchell",2014,100));
        myBS.addBook(new HardcoverBook("A kutya különös esete az éjszakában","Mark Haddon",2003,220));
        myBS.addBook(new HardcoverBook("The Red House","Mark Haddon",2012,230));
        myBS.addBook(new PaperbackBook("Pi élete","Yann Martel",2001,330));
        myBS.addBook(new PaperbackBook("Beatrice and Virgil","Yann Martel",2014,100));
        System.out.println("Könyvespolcon lévő könyvek:\n---------------------------");
        myBS.printBooks();
        System.out.println("---------------------------");
        System.out.println("Legtöbb oldalas könyv:"+myBS.getAuthorOfMostWrittenPages());
        System.out.println("Legkönnyebb könyv:"+myBS.getLightestAuthor());
    }
}
