package com.library;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Book;
import com.library.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book getBookById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Book updateBook(Long id, Book book) {

        Book b = repository.findById(id).orElse(null);

        if (b != null) {
            b.setTitle(book.getTitle());
            b.setAuthor(book.getAuthor());
            b.setPrice(book.getPrice());

            return repository.save(b);
        }

        return null;
    }

    public String deleteBook(Long id) {

        repository.deleteById(id);

        return "Book Deleted Successfully";
    }

}