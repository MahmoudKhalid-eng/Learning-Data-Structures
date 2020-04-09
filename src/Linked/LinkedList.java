
package Linked;


public class LinkedList {
    Node head=null;
    public void insertAtEnd(int value){
        Node new_Node=new Node(value);// separated from the list
        new_Node.next=null;
        if(head == null){    // empty list
            head = new_Node; // make the new list as the first element
        }
        else{
            Node last=head;  // starts from the first element
            while(last.next!=null){ // not the last element
                last = last.next; // move to the next element
            }
            last.next=new_Node; // make it the last element
        }
    }
    
    public void insertAT(int value,int pos){ //pos = element's position in the list
        Node new_Node=new Node(value);  
        new_Node.next=null;
        if(pos == 0){   // if you want make it the first element
            new_Node.next=head; // make it's next the second element
            head = new_Node;    // make the head on the first element
        }
        else{
            Node last=head; // start from the first element
            for(int i=0;i<pos-1;i++){ // stop before the position you want
                last = last.next;   // move to the next element 
            }
            new_Node.next=last.next; // shift right
            last.next=new_Node; 
        }
    }
    
    public void printAll(){
        Node last= head;    // start from list's begin
        while(last !=null){ // don't exceed last element
            System.out.println(last.value); // print current element's value
            last=last.next; // move to the next element
        }
    }
    public void deleteAt(int pos){
        if(pos == 0){   
            head = head.next;
        }
        else{
            Node last=head; // start from the first element
            for(int i=0;i<pos-1;i++){ // stop before the position you want
                last = last.next;   // move to the next element 
            }
            Node j= last.next; // the position that you want to delete
            last.next = j.next;
        }
    }
    
}
