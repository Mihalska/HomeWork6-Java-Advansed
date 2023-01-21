package task3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
/**
 * name of class
 */
public class Main {
    /**
     *  This is a constructor without param
     */
    public Main() {
    }
    /**
     * method main
     * @param args - - strings
     */
    public static void main(String[] args) {
        try {
        Cat cat = new Cat(8,"sphinx");
        Annotation [] annotations = cat.getClass().getAnnotations() ;
        System.out.println(cat.getClass().getName() + "\nAnnotation of class (use Annotation @Inherited) :");
        for (Annotation a : annotations ) {
            System.out.println("\t" + a);
        }
            Class <?> c = cat .getClass() ;
            Method m = c.getDeclaredMethod("song", int.class ) ;
            HelpAn  annotation = m.getAnnotation(HelpAn .class );
            System.out.println("Annotation of method: \n" + "\t" +annotation.toString() );
            //use  my annotation @HelpAn for method and write information about  Cat
            cat.run() ;
            cat.song( annotation.weight()  ) ;
        } catch (Exception e) {
            e.printStackTrace() ;
        }
    }

}
