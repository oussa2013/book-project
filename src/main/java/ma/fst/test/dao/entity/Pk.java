package ma.fst.test.dao.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Oussama_Qaiboub on 2021-01-14.
 */
@Embeddable
public class Pk implements Serializable {
    private Integer libraryId;
    private Integer bookId;
}
