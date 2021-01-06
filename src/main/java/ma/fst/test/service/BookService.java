package ma.fst.test.service;

import ma.fst.test.dao.entity.BookEntity;
import ma.fst.test.presentation.model.Book;

/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */
public interface BookService {

    Book create(Book bookEntity);
    Book read(Integer id);
    Book update(Book bookEntity);
    void delete(Integer id);
}
