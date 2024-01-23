package java8;

import java.util.Arrays;

public class Arrange {
    public static void main(String[] args) {
        int n=7;
        int arrs[]={1 ,2 ,3 ,5, 4, 7 ,10};
        sortIt(arrs,n);
    }
    public static void sortIt(int arr[], int n) {

        int c[]= Arrays.stream(arr).filter(  x -> x%2!=0  ).toArray();  //odd



        int b[]=Arrays.stream(arr).filter(  x->x%2==0  ).toArray();  //even
        System.out.println(Arrays.toString(b));
        int result [] = new int[n];

        Arrays.sort(c);
        Arrays.sort(b);
        int s=0;
        for(int i=c.length-1;i>=0;i--){
            result[s++]=c[i];
        }
        for(int j=0;j<=b.length-1;j++){
            result[s++]=b[j];
        }
        System.out.println(Arrays.toString(result));

    }

}

