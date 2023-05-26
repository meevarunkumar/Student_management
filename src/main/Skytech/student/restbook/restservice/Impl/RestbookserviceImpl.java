package Skytech.student.restbook.restservice.Impl;

import Skytech.student.restbook.restservice.Restbookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;
import java.util.List;

@Service
public class RestbookserviceImpl implements Restbookservice {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getAllDetails() {
        String book = getRestTemplate().getForObject(Restbookservice.BOOK_URL + "getbooklistdata", String.class);
        System.out.println(book);
        return book;
    }

    @Override
    public String getBookById(int id) {
        String book = getRestTemplate().getForObject(Restbookservice.BOOK_URL+ "getbookbyid/"+ id, String.class);
        System.out.println(book);
        return book;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
