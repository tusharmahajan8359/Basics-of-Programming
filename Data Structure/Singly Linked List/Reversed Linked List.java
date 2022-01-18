import java.util.Scanner;
class TestClass {
   
    public static void main(String args[] ) throws Exception {
        
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();

     s.nextLine();

    //LinkedList

     Node list = null;

    Node head = null, href= null, tail = null;
    int prev = -1;

    for(int i=0; i<n; i++){

          int num = s.nextInt();
          if(list == null){

              list = new Node(num);
              head = list;
              href = head;
              tail = list;
              prev = num;
           } else{

              Node newNode = new Node(num);

           if(num%2 == 0 && prev%2==0){

               if(href.data%2!=0){

                  newNode.next = href.next;
                  href.next = newNode;
                } else{ 
                  newNode.next = href;
                  href = newNode;
                  head = href;
                }
           } else{ 

                  tail.next = newNode;
                  href = tail;
                  tail = tail.next;
           }
          prev = num;

        }

    }

    Node curr = head;

    while(curr != null){
          System.out.print(curr.data+" ");
          curr = curr.next;
    }

   }
 }
    
class Node{
    int data;
    Node next;
    public Node(int num){
     data=num;
     next=null;
    }
} 