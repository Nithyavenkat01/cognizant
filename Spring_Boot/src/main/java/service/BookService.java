package service;



import org.springframework.stereotype.Service;

import repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService() {

    }

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {

        System.out.println("Adding Book");

        bookRepository.saveBook();

    }

}