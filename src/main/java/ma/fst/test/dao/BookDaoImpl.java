package ma.fst.test.dao;

import ma.fst.test.presentation.model.Book;

/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */
public class BookDaoImpl implements BookDao {
    @Override
    public Book create(Book book) {
        System.out.println("insert : " + book);
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
