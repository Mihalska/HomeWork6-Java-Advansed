package task2;

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
     *  method main
     *  @param  args - strings
     */


    public static void main(String[] args)  {
        MathCalc mathCalc = new MathCalc() ;
        Class <?> c1= MathCalc.class ;
        try {
            Method m = c1.getDeclaredMethod("addTwoNumbers", int.class, int.class );

            MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class ) ;
            mathCalc.addTwoNumbers(myAnnotation.a(), myAnnotation.b());
            mathCalc.removeTwoNumbers(myAnnotation.a(), myAnnotation.b()) ;
            mathCalc.subTwoNumbers(myAnnotation.a(), myAnnotation.b()) ;
            Method m1= c1.getDeclaredMethod("divTwoNumbers",int.class, int.class );
            MyAnnotation myAnnotation1 = m1.getAnnotation(MyAnnotation.class);
            mathCalc.divTwoNumbers(myAnnotation1.a(), myAnnotation1.b()) ;
        } catch (Exception e) {
            e.printStackTrace() ;
        }

    }
}
