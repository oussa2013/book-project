package ma.fst.test.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */


@Entity
@Table(name="Tbook")
@Getter
@Setter
public class BookEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Column(name="titre")
    String title;
    @Column(name="age")
    Integer age;

    @Transient
    Double total;


    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

}
