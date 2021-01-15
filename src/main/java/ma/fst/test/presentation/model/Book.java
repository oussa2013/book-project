package ma.fst.test.presentation.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Oussama_Qaiboub on 2021-01-06.
 */
@Getter @Setter
public class Book {

    Integer id;
    String title;
    Integer numOfPage;
    Double total;




}
