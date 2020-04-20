
package Stack;


public class Stack {
    int top = -1;
    int size;
    int[] arr; // Empty reference
    public Stack(int size){
        this.size=size;
        arr = new int[this.size];
    }
    public void push(int x){
        if(top==size-1){ // The top is the last element in the array
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top]=x;
        }
    }
    public void pop(){
        top--; // Top equlas the previous element
    }
    public void print(){
        for(int i=0;i<=top;i++){ // Iterate from the bottom to the top 
            System.out.println(arr[i]);
        }
    }
    public void top(){
        System.out.println(arr[top]); // Print the value of top
    }
}
