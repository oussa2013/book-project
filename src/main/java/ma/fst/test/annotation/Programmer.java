package ma.fst.test.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Type;

/**
 * Created by Oussama_Qaiboub on 2021-01-04.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
@Inherited
public @interface Programmer {
     String name() default "said";
     int age() default 12;
     String value();
}
