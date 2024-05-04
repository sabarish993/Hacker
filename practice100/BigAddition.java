package practice100;

import java.math.BigInteger;
import java.util.Scanner;

public class BigAddition {
    public static void main(String[] args) {
        String num1,num2;
        System.out.println("ente the two strings");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the firt nio");
        num1=sc.nextLine();
        System.out.println("enter the second no");
        num2=sc.nextLine();

        BigInteger first=new BigInteger(num1);
        BigInteger second=new BigInteger(num2);
        BigInteger sum;

        sum=first.add(second);
        System.out.println("resuly og addition is"+sum);


    }
}
