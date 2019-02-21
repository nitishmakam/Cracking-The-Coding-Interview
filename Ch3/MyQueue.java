import java.util.*;
public class MyQueue<T>{
    Stack<T> stackNewest,stackOldest;
    public MyQueue(){
        Stack<T> stackNewest = new Stack<T>();
        Stack<T> stackOldest = new Stack<T>();
    }

    public int size(){
        return stackNewest.size() + stackOldest.size();
    }

    public T peek(){
        shiftStacks();
        return stackOldest.peek();
    }

    public void add(T value){
        stackNewest.push(value);
    }

    public void shiftStacks(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                stackOldest.push((stackOldest.pop()));
            }
        }
    }

    public T remove(){
        shiftStacks();
        return stackOldest.pop();
    }
}