package ma.fst.test.presentation.model;

import javax.persistence.*;


/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */

@Entity
@Table(name = "tbook")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer id;

    @Column(name = "titre")
    String title;

    @Column(name = "age")
    Integer age;

    @Override
    public String toString() {
        return "Book{" +
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
