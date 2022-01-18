import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       int val=0,temp=0,res=0;
       // array input
       for(int i=0;i<n;i++)
       {
        a[i]=sc.nextInt();
       }

       for(int i=0;i<n;i++)

       {

           val=a[i];

           temp=a[i];
            // max XOR
           for(int j=i;j<n-1;j++)

           {
               if(a[j+1]>temp){

                   temp=a[j+1];
                   val=val^temp;

               }else
                {
                 continue;

                }

           }
           res=(res>val)?res:val;
         
       }

       System.out.println(res);

    }
}
