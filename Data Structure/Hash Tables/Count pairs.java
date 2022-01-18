import java.util.Scanner ;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int t=1;t<=tc;t++){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long p=sc.nextLong();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
             a[i]=sc.nextLong();
            }
            long c=0;
            for(int i=0;i<n-1;i++){

                for(int j=i+1;j<n;j++){
                    long b=((a[i]*a[i])+(a[j]*a[j])+(a[i]*a[j]))%p;
                    if(b==k){
                        c++;
                    }
                    //System.out.println(a[i]+" "+a[j]+" "+b);
                }
            }
            System.out.println(c);
        }

    }
}