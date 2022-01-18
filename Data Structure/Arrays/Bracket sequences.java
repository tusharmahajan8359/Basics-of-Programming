import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int sol =0;
        for(int i=0;i<n;i++){
           int c=0;
           if(s.charAt(i)=='('){
               for(int j=i;j<i+n;j++){
                   if(s.charAt(j%n)=='('){
                       c++;
                   }else{
                       c--;
                   }
                   if(c<0){
                       break;
                   }
               }
               if(c==0){
                 sol++;  
               }
           }
        }
        System.out.println(sol);

    }
}
