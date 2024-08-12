package CoreJava.practices.overloading.constructOverloading;


class ConstructOverloading {


    ConstructOverloading(String name) {

        System.out.println("I am " + name);

    }

    ConstructOverloading(int a, int b) {

        System.out.println("Addition : " + (a + b));
    }

    ConstructOverloading(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        System.out.println("Factorial : " + fact);

    }

    public static void main(String [] a) {
	    	
	    	ConstructOverloading obj1 = new ConstructOverloading("Vicky");

	    	ConstructOverloading obj2 = new ConstructOverloading(987,433);

	    	ConstructOverloading obj3 = new ConstructOverloading(27);
	    	
	    
	    }
    }