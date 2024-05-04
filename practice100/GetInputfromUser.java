package practice100;

import java.util.Scanner;

public class GetInputfromUser {
    public static void main(String[] args) {
        int a;
        String s;
        float c;

        Scanner in=new Scanner(System.in);

        System.out.println("the String is");
        s=in.nextLine();
        System.out.println("the entered string is"+s);

        System.out.println("the integer is");
        a=in.nextInt();
        System.out.println("the entered integer is"+a);

        System.out.println("the float is");
        c=in.nextFloat();
        System.out.println("the entered float is"+c);
    }
}
