package ma.fst.test.presentation.controller;

import ma.fst.test.dao.entity.BookEntity;
import ma.fst.test.presentation.model.Book;
import ma.fst.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */
@Controller
public class BookController {

    @Autowired
    BookService bookService ;

    public Book create(Book bookEntity) {
        bookService.create(bookEntity);
        return bookEntity;
    }

    public void read(Integer id) {
        System.out.println("read  : " + id);
    }

    public Book update(Book bookEntity) {
        System.out.println("update : " + bookEntity);
        return bookEntity;
    }

    public void delete(Integer id) {
        System.out.println("delete : " + id);

    }
}
