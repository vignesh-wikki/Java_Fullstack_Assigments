package CoreJava.practices.overloading.method_overloading;

public class Overloading {

    void meth1(String name) {
        System.out.println("I am the Alien");
    }

    void meth1(int a, int b) {

        System.out.println("Addition :" + (a + b));
    }

    void meth1(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        System.out.println("Factorial : " + fact);

    }

    public static void main(String[] a) {

        Overloading obj = new Overloading();

        obj.meth1(10);

        obj.meth1("Vignesh");

        obj.meth1(1000, 764);
    }
}
