package com.vuejs.demo.controller;

import com.vuejs.demo.controller.model.ResponseVO;
import com.vuejs.demo.repository.jpa.BookRepository;
import com.vuejs.demo.repository.jpa.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping
    public ResponseVO<?> getBooks() {
        ResponseVO<List<Book>> responseVO = new ResponseVO<>();

        List<Book> test = new ArrayList<>();

        test.add(newBook(1,"jiho", "hell", 23));
        test.add(newBook(2,"helsd", "awef", 2444));
//        List<Book> bookList = bookRepository.findAll();
        responseVO.setMsg("호출 성공");
        responseVO.setResponse(test);
        return responseVO;
    }

    private Book newBook(int id, String author, String bookName, int pageNumber) {
        Book newBook = new Book();
        newBook.setId(id);
        newBook.setPageNember(pageNumber);
        newBook.setName(bookName);
        newBook.setAuthor(author);
        return newBook;
    }
}
