package ma.fst.test.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */


@Entity
@Table(name="livres")
@Getter
@Setter
@ToString
public class BookEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="titre")
    private String title;
    @Column(name="auteur")
    private Integer author;
    @Column(name="nombre_de_pages")
    private Integer numOfPage;

    @Transient
    Double total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_categorie")
    private CategoryEntity categoryEntity;

}
