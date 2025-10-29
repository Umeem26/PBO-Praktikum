import java.util.ArrayList;
import java.util.EmptyStackException; 

public class ArrayListStack<T> {

    private ArrayList<T> items;

    public ArrayListStack() {
        items = new ArrayList<>();
    }

    public void push(T item) {
        items.add(item); 
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items.remove(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty(); 
    }

    public static void main(String[] args) {
        
        ArrayListStack<Integer> stack = new ArrayListStack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        
    }
}