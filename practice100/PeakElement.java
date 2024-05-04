package practice100;

public class PeakElement {
    public static void main(String[] args) {
        int arr[]={1,2,4,20,5,1,0};
        int n=arr.length;
        System.out.println("the peak element is"+FindPeak(arr,n));

    }
    public  static int FindPeak(int arr[],int n){
        if (n==1){
            return  0;
        }
        if (arr[0]>=arr[1]){
            return  0;
        }
        if (arr[n-1]>=arr[n-2]){
            return n-1;
        }
        for (int i=0;i<n-1;i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                return i;
            }
        }
        return 0;
    }
}
