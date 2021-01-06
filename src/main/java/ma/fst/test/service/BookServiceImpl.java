package ma.fst.test.service;

import ma.fst.test.dao.entity.BookEntity;
import ma.fst.test.dao.repository.BookDao;
import ma.fst.test.mapper.BookMapper;
import ma.fst.test.presentation.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Autowired
    BookMapper bookMapper;

    @Override
    public Book create(Book book) {
       // BookEntity bookEntity = bookMapper.convertToEntity(book);
        bookDao.create(bookMapper.convertToEntity(book));
        return book;
    }

    @Override
    public Book read(Integer id) {
        BookEntity bookEntity = bookDao.read(id);
       // Book book = bookMapper.convertToModel(bookEntity);
        //System.out.println("read  : " + id);
        return bookMapper.convertToModel(bookEntity);
    }

    @Override
    public Book update(Book bookEntity) {
        System.out.println("update : " + bookEntity);
        return bookEntity;
    }

    @Override
    public void delete(Integer id) {
        System.out.println("delete : " + id);

    }
}
