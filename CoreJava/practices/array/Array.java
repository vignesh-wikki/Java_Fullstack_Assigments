package CoreJava.practices.array;

import java.util.Scanner;
import java.util.logging.*;

public class Array {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Array.class.getName());
        logger.setLevel(Level.ALL);
        int[] arr = new int[5];
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        logger.info("Enter the array values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        logger.info("Array values are : ");

        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
            sum += arr[i];
        }

        logger.log(Level.INFO, " Sum of the Array values are :{0} ", sum);

        sc.close();

    }
}
