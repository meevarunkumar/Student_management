package Skytech.student.controller;

import Skytech.student.restbook.restservice.Impl.RestbookserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ReadBookRestController {
    @Autowired
    RestbookserviceImpl restbookserviceImpl ;

    @GetMapping("/getbooklistdata")
    public String getbookdata(){
        String bookList = restbookserviceImpl.getAllDetails();
        return bookList;
    }

    @GetMapping("getbookbyid/{id}")
    public String getBookById(@PathVariable int id ){
        String bookById = restbookserviceImpl.getBookById(id);
        return bookById;
    }
}
