package practice100;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
         int x,y,temp;
        System.out.println("enter the x and y value");
        Scanner sc=new Scanner(System.in);

        x=sc.nextInt();
        y=sc.nextInt();

        System.out.println("the value of before swapping\nx"+x+"\ny"+y);

        temp=x;
        x=y;
        y=temp;
        System.out.println("the value of ahter swapping\nx"+x+"\ny"+y);

    }
}
