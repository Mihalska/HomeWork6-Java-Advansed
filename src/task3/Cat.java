package task3;
/**
 * name of class
 */

public class Cat extends Animal {
    /**
     * This is a constructor with param
     * @param age - age of Cat
     * @param bread - bread of Cat
     */
    public Cat(int age, String bread) {
        super(age, bread);
    }

    /**
     * method run
     */
    @Override
    public void run() {
        System.out.print("Cat: " + age+ " age, bread - " + bread + ", саn run and jump,  weight = ");
    }

    @HelpAn ( weight = 7)
    public void song (int weight){
        System.out.println(weight );

    }




}

