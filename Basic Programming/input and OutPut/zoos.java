import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int z=0;
        int o=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='z'){
                z++;
            }
            else if(s.charAt(i)=='o'){
              o++; 
            }
        }
          if(z*2==o){
              System.out.println("Yes");
          }else{
              System.out.println("No");
          }
    }
}
