import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ns="";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
               ns=ns+Character.toLowerCase(s.charAt(i));
            }else{
                ns=ns+Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println(ns);
    }
}