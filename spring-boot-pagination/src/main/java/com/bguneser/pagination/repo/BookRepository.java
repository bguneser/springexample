package com.bguneser.pagination.repo;


import com.bguneser.pagination.model.Book;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {



}
