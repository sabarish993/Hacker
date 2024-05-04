package practice100;

public class IntersectionOfArray {
    static  int i,j,k,c=0,w;
    public static void main(String[] args) {
        int[] x={1,2,3,4,5};
        System.out.println("the first array is"+"");
        for (int i=0;i<x.length;i++);
        System.out.println(x[i]+"");
        int[] y={2,3,4,5,6};
        for (int j=0;j<y.length;i++);
        System.out.println(y[i]+"");
        System.out.println("");
        intersection(x,y);

    }
    static  void intersection(int x[],int y[]){
        int z[]=new int[x.length+y.length];
        for (int i=0;i<(x.length);i++){
            for (j=0;j<y.length;j++){
                if(x[i]==y[i]){
                    z[c]=x[i];
                    c++;
                }
                else {
                    continue;

                }
            }
        }
        System.out.println("the intersected array");
        for (k=0;k<c;k++){
            System.out.println(z[k]+"");
        }
        System.out.println("");
    }
}
