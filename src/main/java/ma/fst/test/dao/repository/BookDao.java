package ma.fst.test.dao.repository;

import ma.fst.test.dao.entity.BookEntity;

/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */
public interface BookDao {
    // CRUD
    BookEntity create(BookEntity bookEntity);
    BookEntity read(Integer id);
    BookEntity update(BookEntity bookEntity);
    void delete(Integer id);
}
