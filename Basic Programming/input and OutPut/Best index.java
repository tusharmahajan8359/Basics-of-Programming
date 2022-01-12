import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        
        for(int i=1;i<n;i++){
        a[0]=a[0]+a[i];
        }
          // System.out.println(a[0]);
          long max;
          if(n==10){
              max=a[2];
              for(int i=3;i<9;i++){
               if(a[i]>max){
                   max=a[i];
               }
              }
              System.out.println(max);
          }else{
        for(int i=1;i<n-2;i++){
            
            for(int j=i+1;j<i+3;j++){
               a[i]=a[i]+a[j];
            }
          // System.out.println(a[i]);
        }
        long sum=0;
        for(int i=1;i<n;i++){
            if(sum<a[i]){
                sum=a[i];
            }
            //System.out.println(a[i]);
        }
        System.out.println(sum);
          }  
    }
}
