package ma.fst.test.dao;

import ma.fst.test.presentation.model.Book;
import org.springframework.stereotype.Repository;

/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */
public interface BookDao {
    // CRUD
    Book create(Book book);
    void read(Integer id);
    Book update(Book book);
    void delete(Integer id);
}
