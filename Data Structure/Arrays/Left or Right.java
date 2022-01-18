import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);  
      int n=sc.nextInt();
      int t=sc.nextInt();
      int a[]=new int[n];
      int pc=0;
      // input array
      for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
      }
      //test cases
      for(int i=1;i<=t;i++){
          int p=sc.nextInt();
          int v=sc.nextInt();
          char c=sc.next().charAt(0);
          pc=0;
          //left traversal 
          if(c=='L'){
             do{
              if(a[p]==v){
                
                break;
              }
              if(pc>=n){
                pc=-1;
                break;
              }
              pc++;
              if(p==0){
                  p=n-1;
              }else{
                  p=(p-1)%n;
              }

             }while(a[p]!=v);
          }else{
              //Right traversal
              do{
              if(a[p]==v){
                
                break;
              }
              if(pc>=n){
                pc=-1;
                break;
              }
              pc++;
              if(p==0){
                  p=n-1;
              }else{
                  p=(p+1)%n;
              }

             }while(a[p]!=v);
          }
          //Output
          System.out.println(pc);
      }
    }
}