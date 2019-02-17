package com.vuejs.demo.repository.jpa;

import com.vuejs.demo.repository.jpa.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookRepositoryTest {
    @Autowired
    BookRepository bookRepository;

    @Test
    public void findAll() {

        Book newBook = new Book();
        newBook.setAuthor("sadf");
        newBook.setName("asdf");
        newBook.setPageNember(2323);

        bookRepository.save(newBook);
        List<Book> bookList = bookRepository.findAll();
        assertThat(bookList.size(), is(1));
    }

}