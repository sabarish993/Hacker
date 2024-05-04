package practice100;

import java.util.Scanner;

public class FraenheattoTemprature {
    public static void main(String[] args) {
        float temprature;
        Scanner sc=new Scanner(System.in);

        System.out.println("cconversion of emp");
        temprature=sc.nextFloat();
        temprature=((temprature-32)*5)/9;
        System.out.println("the converted bvalue is"+temprature);



    }
}
