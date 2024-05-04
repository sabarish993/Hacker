package practice100;

public class PalindromeofNumber {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n;
        temp=n=121;
        if(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum){
            System.out.println("palinfrome");
        }
        else {
            System.out.println("not a plaindrome");
        }
    }
}
