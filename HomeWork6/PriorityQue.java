import java.util.Arrays;
public class PriorityQue{
   private int items[];
   private int front,rear;
    public PriorityQue(int size) {
        items = new int[size];
        front = -1;
        rear = -1;
    }
    public  boolean isFull(){
        if(front==0 && rear == items.length - 1){
        return  true;
        }
        return false;
    }
    public void enQueue(int element){
        if (isFull()) throw new RuntimeException("Очередь переполнена");
        else {
            if (front == -1)  front = 0;
            rear++;
            items[rear] = element;
            Arrays.sort(items,front,rear);
        }
    }
    public void pop(int element){
        if(isEmpty()) throw new RuntimeException("Очередь пуста");
        else {
            if (front == rear) {
                rear = -1;
                front = -1;
            }
            else front++;
            Arrays.sort(items,front,rear);
        }
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public int peek() {
        return items[front];
    }
}
