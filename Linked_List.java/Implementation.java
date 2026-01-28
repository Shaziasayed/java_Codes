import java.util.Scanner;
public  class Implementation{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void AddFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data +"->"+"");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Implementation list=new Implementation();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            list.AddFirst(data);
        }
        list.printList();
        sc.close();
    }
}