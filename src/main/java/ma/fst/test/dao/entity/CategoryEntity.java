package ma.fst.test.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-01-14.
 */
@Entity
@Getter
@Setter
@Table(name = "categories")
public class CategoryEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "code")
    private String Code;
    @Column(name = "categorie")
    String category;

    @OneToMany(fetch = FetchType.LAZY,
                mappedBy = "categoryEntity",
            cascade = CascadeType.ALL)
    private List<BookEntity> bookEntity = new ArrayList<>();




}
