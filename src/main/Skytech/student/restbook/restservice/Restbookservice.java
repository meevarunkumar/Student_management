package Skytech.student.restbook.restservice;

import java.awt.print.Book;
import java.util.List;

public interface Restbookservice {

   String  BOOK_URL= "http://localhost:1812/BookManagement_war_exploded/";
    public  String getAllDetails();
    public String getBookById(int id);
}
