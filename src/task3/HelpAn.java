package task3;

import java.lang.annotation.*;
@Target(ElementType.METHOD  )
@Retention(RetentionPolicy.RUNTIME )
public @interface HelpAn {
    /**
     * method weight
     * @return 5
     */
    int weight() default 5;

    }


