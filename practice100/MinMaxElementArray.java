package practice100;

import java.util.Arrays;

public class MinMaxElementArray {
    public static void main(String[] args) {
//        int a[]={3,5,4,7,2,1};
//        Arrays.sort(a);
////        System.out.println("the sorted array is"+a);
//        System.out.println("min-"+a[0]+"max-"+a[a.length-1]);
        int arr[]={4,6,2,8,3,1};
        int n=arr.length;
        System.out.println("the max value is"+getMax(arr,n));
        System.out.println("the min value is"+getMin(arr,n));

    }

    static  int getMin(int arr[],int n){
        return Arrays.stream(arr).min().getAsInt();
    }
    static  int getMax(int arr[],int n){
        return  Arrays.stream(arr).max().getAsInt();
    }
}
