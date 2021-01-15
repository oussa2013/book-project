package ma.fst.test.dao.repository;

import jdk.nashorn.internal.objects.annotations.Getter;
import ma.fst.test.dao.entity.BookEntity;
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
    public BookEntity create(BookEntity bookEntity) {
        em.getTransaction().begin();
        em.persist(bookEntity);
        em.getTransaction().commit();
        return bookEntity;
    }

    @Override
    public BookEntity read(Integer id) {

        em.getTransaction().begin();
        //BookEntity bookEntity = em.find(id);
        BookEntity bookEntity = new BookEntity();
        em.getTransaction().commit();
        //System.out.println("read  : " + id);
       return bookEntity;
    }

    @Override
    public BookEntity update(BookEntity bookEntity) {
        System.out.println("update : " + bookEntity);
        return bookEntity;
    }

    @Override
    public void delete(Integer id) {
        System.out.println("delete : " + id);

    }
}
