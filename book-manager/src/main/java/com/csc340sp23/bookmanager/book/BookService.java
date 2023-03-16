
package com.csc340sp23.bookmanager.book;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    
     @Autowired
    private BookRepository repo;

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book getBook(long BookId) {
        return repo.getReferenceById(BookId);
    }

    public void deleteBook(long BookId) {
        repo.deleteById(BookId);
    }

    void saveBook(Book Book) {

        repo.save(Book);
    }

}
