package ma.fst.test.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-01-14.
 */
@Entity
@Table(name = "biblio")
public class LibraryEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "code")
    private String Code;
    @Column(name = "nom")
    private String name;
    @Column(name = "adresse")
    private String address;

    /*@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "livre_biblio",
    joinColumns = @JoinColumn(name = "id_library"),
    inverseJoinColumns = @JoinColumn(name = "id_book"))
    private List<BookEntity> bookEntities = new ArrayList<>();*/


}
