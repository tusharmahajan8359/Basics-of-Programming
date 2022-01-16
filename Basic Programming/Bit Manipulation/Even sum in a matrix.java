import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]%2==0){
                    max=a[i][j];
                }
            }
        }
       
        for(int i=0;i<m;i++){
            int max1=a[i][0];
            
            for(int j=1;j<n;j++){
               max1=max1+a[i][j];
               a[i][j]=max1;
            }
        }
         
       for(int i=0;i<m;i++){
            
            for(int j=1;j<n;j++){
               if(a[i][j]%2==0 && max<a[i][j]){
                   max=a[i][j];
               }
            }
        } 
      System.out.println(max);
    }
}
