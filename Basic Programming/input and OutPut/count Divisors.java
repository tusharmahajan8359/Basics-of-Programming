import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int l=s.nextInt();
        int r=s.nextInt();
        int k=s.nextInt();
        int count=0;
        for(int i=l;i<=r;i++){
            if(i%k==0){
                count++;
            }
        }
      System.out.println(count);
    }
}
