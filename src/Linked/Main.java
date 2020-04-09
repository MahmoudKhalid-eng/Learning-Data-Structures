
package Linked;


public class Main {
    public static void main(String[] args) {
        /*
        LinkedList l=new LinkedList();
        l.insertAtEnd(1);//1
        l.insertAtEnd(2);//1,2
        l.insertAtEnd(3);//1,2,3
        l.printAll();
        */
        
        /*
        LinkedList l=new LinkedList();
        l.insertAT(1,0);//1
        l.insertAT(2,1);//1,2
        l.insertAT(3,2);//1,2,3
        l.insertAT(4,3);//1,2,3,4   //shift to right
        l.insertAT(5,1);//1,5,2,3,4
        l.printAll();
        */
        
        LinkedList l=new LinkedList();
        l.insertAT(1,0);//1
        l.insertAT(2,1);//1,2
        l.insertAT(3,2);//1,2,3
        l.insertAT(4,3);//1,2,3,4  
        l.deleteAt(0);//2,3,4
        l.deleteAt(0);//3,4
        l.deleteAt(1);//3
        l.printAll();
    }
}
