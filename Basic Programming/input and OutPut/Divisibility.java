import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String msg="";
        long a[]=new long[N];
        for(int i=0;i<N;i++){
         a[i]=sc.nextLong();
        }
       if(a[N-1]%10==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}