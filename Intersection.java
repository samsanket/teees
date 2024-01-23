public class Intersection {
    public static void main(String[] args) {
       int a[]= {1,2,3,4,5,6,7};
       int b[]= {4,5,6};
       int  x= a.length>b.length?a.length:b.length;
       int c[]= new int[x];
       int k=0;
      for (int i=0;i<a.length;i++){
          for (int j=0;j<b.length;j++){
              if (a[i]==a[j]){
                  c[k++]=a[i];
              }
          }
      }
        for (int i : c) {
            System.out.println(i);
        }
    }

}
