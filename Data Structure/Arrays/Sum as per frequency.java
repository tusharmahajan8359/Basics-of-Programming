import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // array sorting
        for(int i=0;i<n-1;i++){
        for(int j=i;j<n;j++){
            if(a[i]>a[j]){
             int t=a[i];
             a[i]=a[j];
             a[j]=t;
            }
        }
        }
       
        int q=sc.nextInt();
        for(int h=1;h<=q;h++){
          int l=sc.nextInt();
          int m=sc.nextInt();
          int f=0,num=0,sum=0;;
         for(int i=0;i<n;i++){
            num=a[i];
            f=0;
            int tsum=0;
            while(true){
            if(num==a[i]){
              f++;
              tsum=tsum+a[i];
              
              if(i<n-1){
                  i++;
              }else
              break;
            }else{
                i--;
                break;
            }
            }
            if(f>=l && f<=m){
                sum=sum+tsum;
               // System.out.println(tsum+" "+sum);
            }
            
         }
          
         
          System.out.println(sum);
        }

    }
}
