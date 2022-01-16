import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){

        int a=sc.nextInt();
        int b=sc.nextInt();
        char c=sc.next().charAt(0);
        String str = Integer.toBinaryString(a);

      if(str.length() < 16)

        {     
          int d = 16 - str.length();

         for (int j = 0; j < d; j++) {

            str = "0"+str;

          }

        } 
        //System.out.println(str);
        if(c=='L'){
            for (int j = 0; j < b; j++) {

            str = str.substring(1,16)+ str.charAt(0);

           }
           System.out.println(Integer.parseInt(str,2));
        }
        else{
             for (int j = 0; j < b; j++) {

              str = str.charAt(15) + str.substring(0,15);

             }
             System.out.println(Integer.parseInt(str,2));
        }

        }



    }
}
