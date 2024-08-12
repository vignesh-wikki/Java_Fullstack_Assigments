package CoreJava.practices.variables;

public class Variables {

    int b = 20;

    static int c = 30;

    public static void main(String[] args) {

        int a = 10;

        System.out.println("Local variable : " + a);

        Variables obj = new Variables();

        System.out.println(obj.b);

        System.out.println(c);

    }

}
