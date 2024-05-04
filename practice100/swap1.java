package practice100;

import java.util.Scanner;

public class swap1 {
    public static void main(String[] args) {
        int x,y;
        System.out.println("enter the x and y value is");
        Scanner sc=new Scanner(System.in);

        x=sc.nextInt();
        y=sc.nextInt();

        System.out.println("the value of before swapping\nx"+x+"\ny"+y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("the value of ahter swapping\nx="+x+"\ny="+y);
    }
}
