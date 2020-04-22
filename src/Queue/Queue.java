
package Queue;


public class Queue {
    int first= -1;
    int last= -1;
    int length=-1;
    int[] arr;
    public Queue(int x){
        this.length=x;
        this.first=-1;
        this.last=-1;
        arr = new int[this.length];
    }
    public boolean isEmpty(){
        return (first==-1&&last==-1);
    }
    public boolean isFull(){
        // if first equals last and not equals -1 --> queue is full
        // first is in the first of queue and last at the end --> queue is full
        return (first==last&& last!=-1)||(first==-1&& last==length-1);
    }
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else{
            last = (last+1)%length; // circular
            arr[last]=value; 
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            first=(first+1)%length; // cicular
            int tmp=arr[first];
            if(first==last){ // if queue is empty reset it
                first =-1;
                last = -1;
            }
            return tmp;
        }
    }
}
