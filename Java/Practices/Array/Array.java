package Java.Practices.Array;
import java.util.Scanner;

class Array {
    public static void main(String []args) {

       // int arr[] = {1,2,3};
       // int arr1[] = int[10];
       // int arr2[]  = int [] {1,2,3,4};
       
       int arr[] = new int[5];
       int sum = 0;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the array values : ");
       for(int i=0;i<arr.length;i++){
       arr[i]=sc.nextInt();
       }
       System.out.println("Array values are : ");
       for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
       sum+=arr[i];
       }
       System.out.println(" Sum of the Array values are : "+sum);
       
       
    }
}
