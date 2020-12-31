package ma.fst.test.service;

import ma.fst.test.presentation.model.Book;

/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */
public interface BookService {

    Book create(Book book);
    void read(Integer id);
    Book update(Book book);
    void delete(Integer id);
}