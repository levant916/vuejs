package com.vuejs.demo.repository.jpa;

import com.vuejs.demo.repository.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
