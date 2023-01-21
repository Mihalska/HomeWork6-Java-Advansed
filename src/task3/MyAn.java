package task3;

import java.lang.annotation.*;
/**
 * name of Interface
 */
@Target(ElementType.TYPE )
@Retention(RetentionPolicy.RUNTIME )
@Inherited
public @interface MyAn {
    /**
     * method colour
     * @return "Black"
     */
    String colour () default "Black";
}
