package task2;

/**
 * name of class
 */

public class MathCalc {
    /**
     * This is a constructor without param
     */
    public MathCalc() {
    }

    /**
     *  method addTwoNumbers
     *  @param a - first param
     *  @param b - second param
     */
    @MyAnnotation (a = 10, b = 20)
    public void addTwoNumbers (int a, int b) {
        System.out.println(a + b);
    }
    /**
     *  method removeTwoNumbers
     * @param a - first param
     * @param b - second param
     */

    @MyAnnotation (a = 10, b = 20)
        public void removeTwoNumbers (int a,int b){
        System.out.println(a - b);

        }
    /**
     *  method subTwoNumbers
     * @param a - first param
     * @param b - second param
     */

    @MyAnnotation (a = 10, b = 20)
    public void subTwoNumbers (int a,int b){
        System.out.println(a * b);

    }
    /**
     *  method divTwoNumbers
     * @param a - first param
     * @param b - second param
     */
    @MyAnnotation (a = 400, b = 10)
    public void divTwoNumbers (int a ,int b)  {
       try {
            System.out.println(a / b );
       } catch (ArithmeticException e ){
       System.out.println(e.getMessage() );
        }


    }





}
