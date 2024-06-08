public class Stack_array {
    int[] arr;
    int topOfStack;

    public Stack_array(int size){
        arr = new int[size];
        topOfStack = -1;
        System.out.println("The stack is created with the size of " + size);
    }

    //isEmpty

    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        }
        return false;
    }

    //isfull
    public boolean isFull(){
        if (topOfStack == arr.length - 1){
            return true;
        }
        return false;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack is full");
        }
        else{
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    //pop
    public int pop() {
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        else{
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    //peek
    public int peek(){
        if (isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }
        return arr[topOfStack];
    }

    //delete 
    public void delete(){
        arr = null;
        System.out.println("Stack deleted successfully");
    }

    public static void main(String[] args) {
        Stack_array newStack = new Stack_array(4);
        // boolean result = newStack.isEmpty();
        // System.out.println(result);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        // int result = newStack.peek();
        // System.out.println(result);
        // int result1= newStack.peek();
        // System.out.println(result1);
        newStack.delete();
    }
}
