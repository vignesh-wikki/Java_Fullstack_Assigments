
public class Objects {
    public static void main(String[] args) {
        String str  = "Hello ";
        String str1 = "Hello ";

        String str2 = new String("I am the Alien. ");
        String str3 = new String("I am the Alien. ");

        if(str.equals(str1)) System.out.println("String and string are equal");
        else 
            System.out.println("String and string are not equal");
            if (str2.equals(str3))
            System.out.println("String objects are equal");
        else
            System.out.println("String objects are not equal");


            if (str.equals(str2))
            System.out.println("String and string are equal");
        else
            System.out.println("String and string are not equal");
        if (str1.equals(str3))
            System.out.println("String objects are equal");
        else
            System.out.println("String objects are not equal");
    }
}
