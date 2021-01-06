package ma.fst.test.dao.entity;

import javax.persistence.*;


/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */


@Entity
@Table(name="Tbook")
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

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getAge() {
        return age;
    }

    public Double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
