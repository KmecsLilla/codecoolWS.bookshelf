package com.codecool.bookshelf;

import com.codecool.bookshelf.model.books.Book;
import com.codecool.bookshelf.model.books.HardcoverBook;
import com.codecool.bookshelf.model.books.PaperbackBook;
import com.codecool.bookshelf.model.user.Costumer;
import lombok.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static com.codecool.bookshelf.model.books.GenreType.*;
@NoArgsConstructor
public class MyMockDatabase {
    private List<Book> myBS = new ArrayList<>();
    private List<Costumer> costumers = new ArrayList<>();

    public void fillBookListOnShelf(){
        myBS.add(new HardcoverBook(1, "Felhőatlasz", "David Mitchell", 2004, 200, SCIFI));
        myBS.add(new HardcoverBook(2, "Összeesküvés Amerika ellen", "Philip Roth", 2004, 250, DRAMA));
        myBS.add(new PaperbackBook(3, "Szellemírók", "David Mitchell", 1999, 300, SCIFI));
        myBS.add(new PaperbackBook(4, "Csontórák", "David Mitchell", 2014, 100, DRAMA));
        myBS.add(new HardcoverBook(5, "A kutya különös esete az éjszakában", "Mark Haddon", 2003, 220, FANTASY));
        myBS.add(new HardcoverBook(6, "The Red House", "Mark Haddon", 2012, 230, FICTION));
        myBS.add(new PaperbackBook(7, "Pi élete", "Yann Martel", 2001, 330, DRAMA));
        myBS.add(new PaperbackBook(8, "Beatrice and Virgil", "Yann Martel", 2014, 100, DRAMA));
    }

    public List<Costumer> customerList(){
        List<Costumer> costumers = new ArrayList<>();
        costumers.add(new Costumer(1,"Pop Simon", Date.valueOf("1999-09-09"),"email@mail.hu"));
        return costumers;
    }
}
