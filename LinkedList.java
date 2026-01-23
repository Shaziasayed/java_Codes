public class LinkedList {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public  void addFirst(String data){
        Node newnode=new Node(data);

        if (head==null){
            head=newnode;
            return ;        
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLast(String data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;
    }
    public  void print(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.addFirst("This");
        list.addFirst("is");
        list.print();
                list.addLast("Linked");
        list.print();
    }
}
