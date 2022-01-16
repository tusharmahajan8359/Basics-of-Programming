import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            long f=s.nextLong();
            long l=s.nextLong();

            boolean flag =true;
            while(f>0){

                if(f % l >=2){

                    flag =false;

                    break;

                }else{

                    f = f / l;

                }

            }

            if(flag ==true){

                System.out.println("YES");

            }else{

                System.out.println("NO");

            }
        }

    }
}