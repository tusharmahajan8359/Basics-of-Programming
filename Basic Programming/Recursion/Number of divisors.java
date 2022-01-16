import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        TestClass t=new TestClass();
          Scanner sc=new Scanner(System.in);
          int tc=sc.nextInt();
          for(int i=0;i<tc;i++){
              long a=sc.nextLong();
              long b=sc.nextLong();
             long sum=t.solve(a,b);
             System.out.println(sum); 
               
              
              
      }
    }
     public long solve(long n,long k){
        long total;
        long b=0;
        long ans;
        if(n<k){
            return (n*(n+1)/2);
        }
        else if((n/k)==1){
            return n*(n+1)/2-k+1;
        }
        else{
            total=n*(n+1)/2;
            long divisors=n/k;
            long n2=divisors*k;
            b=b+solve(n2/k,k);
            long c=((divisors)*(2*k+(divisors-1)*k))/2;
            return (total-c+b);
        }
    }
}