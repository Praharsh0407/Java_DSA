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

    



    public static void main(String[] args) {
        Stack_array newStack = new Stack_array(4);
        boolean result = newStack.isEmpty();
        System.out.println(result);
    }



}
