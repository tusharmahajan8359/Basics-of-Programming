import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
      Scanner sc=new Scanner(System.in);
      int tc=sc.nextInt();
      for(int t=1;t<=tc;t++){
          int n=sc.nextInt();
          long a[]=new long[n];
          for(int i=0;i<n;i++){
              a[i]=sc.nextLong();
          }
          long b[]=new long[n];
          b[0]=a[0];
          for(int i=1;i<n;i++){
            if(a[i]<b[i-1]){
                b[i]=b[i-1];
                if(b[i]%a[i]!=0){
                    b[i]+=a[i]-(b[i]%a[i]);
                }
            }
            else{
                b[i]=a[i];
            }  
          }
          for(int j=0;j<n;j++){
              System.out.print(b[j]+" ");
          }
          System.out.println();
      }
    }
}
