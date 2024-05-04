package practice100;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("enter the x and y value");
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        z=x+y;
        System.out.println("the addes value is\nz="+z);

    }

}
