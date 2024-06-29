package Lab9_Week14.Q1;

import java.util.ArrayList;

public class GenericStack <T> extends ArrayList<T> {
    public void push(T t){
        this.add(t);
    }
    public  T pop(){
        if (this.isEmpty()) {
            return null;
        }
        return this.remove(this.size() - 1);
    }
    public T peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.get(this.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return this.size() == 0;
    }
    public int getSize() {
        return size();
    }
}
