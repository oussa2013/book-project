package ma.fst.test.dao;

import ma.fst.test.presentation.model.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */
@Repository
public class BookDaoImpl implements BookDao {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
    private EntityManager em = emf.createEntityManager();

    @Override
    public Book create(Book book) {
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
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
