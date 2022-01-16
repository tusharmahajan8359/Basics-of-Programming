import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
       
        for(int j=1;j<=tc;j++){
             int n=sc.nextInt();
             long a[]=new long[n];
             long odd=0,even=0;
       
             for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
               if(a[i]%2==0){
                  
                  even++;
               
               }else{

                    odd++;
               }
            }
            System.out.println((odd<even)?odd:even);
        
        }
    }
}
