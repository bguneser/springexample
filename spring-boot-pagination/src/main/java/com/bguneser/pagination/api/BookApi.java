package com.bguneser.pagination.api;

import com.bguneser.pagination.model.Book;
import com.bguneser.pagination.repo.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookApi  {

    private final BookRepository bookRepository;

    @GetMapping
    public Page<Book> pagination(@RequestParam Integer pageSize, @RequestParam Integer page){

        // totalElement count query çalıştırıyor bunun yerine maaliyetten kaçmak için slice kullanılıyor
        Pageable pageable =  PageRequest.of(page,pageSize);
        return bookRepository.findAll(pageable);

    }


    @GetMapping("/p")
    public Page<Book> pagination(Pageable pageable){
        return bookRepository.findAll(pageable);

    }

    //slice atılan pageable'dan 1 fazla kayıt çekiyor hepsini almıyor
    @GetMapping("/s")
    public Page<Book> slice(Pageable pageable){
        return bookRepository.findAll(pageable);

    }
}
