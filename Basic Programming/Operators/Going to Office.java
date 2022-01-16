import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int D,Oc,Of,Od,Cs,Cb,Cm,Cd;
        D=sc.nextInt();
        Oc=sc.nextInt();
        Of=sc.nextInt();
        Od=sc.nextInt();
        Cs=sc.nextInt();
        Cb=sc.nextInt();
        Cm=sc.nextInt();
        Cd=sc.nextInt();

        int online=Oc+(D-Of)*Od;
        int classic=Cd+((D/Cs)*Cm)+D*Cd;
        if(online<=classic){
          System.out.println("Online Taxi");
        }else{
            System.out.println("Classic Taxi");
        }

    }
}
