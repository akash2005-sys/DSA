import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LL{
    Node head;
    public void insertAtBegin(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        
    }
    public void insertAtEnd(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
        
    }
    public void insertAtPosition(int data,int pos){
        if(pos==0){
            insertAtBegin(data);
            return;
        }
        if(pos<0){
            System.out.println("not valid");
            return;
        }
        Node newnode=new Node(data);
        Node current =head;
        for(int i=0;i<pos-1;i++){
            current=current.next;
            
        }
        newnode.next=current.next;
        current.next=newnode;
        
        
    }
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        LL obj =new LL();
        for(int i=0;i<n;i++){
            
            obj.insertAtEnd(sc.nextInt());
        }
        obj.insertAtPosition(3,0);
        obj.display();
    }
}
