package ma.fst.test.presentation.model;

import javax.persistence.*;

/**
 * Created by Oussama_Qaiboub on 2021-01-06.
 */
public class Book {

    Integer id;
    String title;
    Integer age;
    Double total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setTotal(Double total) {
        this.total = total;
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
}
