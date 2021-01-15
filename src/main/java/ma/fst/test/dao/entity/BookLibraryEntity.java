package ma.fst.test.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Oussama_Qaiboub on 2021-01-14.
 */
@Entity
@Table(name = "livre_biblio")
@Getter @Setter
public class BookLibraryEntity {

    @EmbeddedId
    private Pk id;

    @Column(name = "number_livres")
    private Integer numberOfBook;

    @Column(name = "test")
    private String tesst;

    @ManyToOne
    @JoinColumn(name = "id_biblio" ,referencedColumnName = "id")
    @MapsId("libraryId")
    private LibraryEntity libraryEntity;

    @ManyToOne
    @JoinColumn(name = "id_livre" ,referencedColumnName = "id")
    @MapsId("bookId")
    private BookEntity bookEntity;

    @ManyToOne
    @JoinColumn(name = "id_category" ,referencedColumnName = "id")
    @MapsId("categoryId")
    private CategoryEntity categoryEntity;
}


