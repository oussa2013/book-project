package ma.fst.test.annotation;

import java.lang.annotation.*;

/**
 * Created by Oussama_Qaiboub on 2021-01-04.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
@Inherited
public @interface Dev {
    String name();
    int age();
}
