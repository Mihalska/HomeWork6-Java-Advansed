package task4;


import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

    MyMath math = new MyMath()  ;
    Class <?> c = math.getClass() ;
    try {
        Method m = c.getDeclaredMethod("mathSum", int.class, int.class ) ;
        Math annotation = m.getAnnotation(Math.class );
        math.mathSum( annotation.num1(),  annotation.num2() );

    } catch (Exception e) {
        e.printStackTrace() ;
    }
    }
}
