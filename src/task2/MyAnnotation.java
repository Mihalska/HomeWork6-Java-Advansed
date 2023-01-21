package task2;

import java.lang.annotation.*;

/**
 * name of Interface
 */

@Target(ElementType.METHOD )
@Documented
@Retention(RetentionPolicy.RUNTIME )
public @interface MyAnnotation {
    /**
     * method a
     * @return 0
     */

    int a () default 0;
    /**
     * method b
     * @return 0
     */
    int b () default 0;



}
