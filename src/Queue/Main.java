
package Queue;


public class Main {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enqueue(1); // 1
        q.enqueue(2); // 1 2
        q.enqueue(3); // 1 2 3
        q.enqueue(4); // 1 2 3 4
        q.enqueue(5); // 1 2 3 4 5
        System.out.println(q.isEmpty());// false
        System.out.println(q.isFull());// true
    }
}
