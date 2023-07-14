package gb.javaproject;
import java.util.LinkedList;

class MyQueue {
    private LinkedList elements = new LinkedList();

    public MyQueue(LinkedList linkedList) {
        this.elements = linkedList;
    }
    public void enqueue(int n){
        this.elements.addLast(n);
    }
    public int dequeue(){
        return (int) this.elements.removeFirst();
    }
    public int first(){
        return (int) this.elements.getFirst();
    }
}

