package ma.fst.test.service;

import ma.fst.test.dao.BookDao;
import ma.fst.test.presentation.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */
public class BookServiceImpl implements BookService {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    BookDao bookDao = (BookDao) context.getBean("d");

    @Override
    public Book create(Book book) {
        bookDao.create(book);
        return book;
    }

    @Override
    public void read(Integer id) {
        System.out.println("read  : " + id);
    }

    @Override
    public Book update(Book book) {
        System.out.println("update : " + book);
        return book;
    }

    @Override
    public void delete(Integer id) {
        System.out.println("delete : " + id);

    }
}
