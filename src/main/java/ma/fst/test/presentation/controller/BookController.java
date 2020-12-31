package ma.fst.test.presentation.controller;

import ma.fst.test.presentation.model.Book;
import ma.fst.test.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */
public class BookController {

/*
     ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    BookService bookService = (BookService) context.getBean("s");
*/

    public Book create(Book book) {
        //bookService.create(book);
        return book;
    }

    public void read(Integer id) {
        System.out.println("read  : " + id);
    }

    public Book update(Book book) {
        System.out.println("update : " + book);
        return book;
    }

    public void delete(Integer id) {
        System.out.println("delete : " + id);

    }
}
