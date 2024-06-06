public class Doubly_Linked_List {
    public class Node{
        public int value;
        public Node next;
        public Node previous;
    }

    public Node head;
    public Node tail;
    public int size;

    //creation
    public Node createDoublyLinkedList(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.previous = null;
        node.value = nodeValue;
        head = tail = node;
        size = 1;
        return head;
    }

    //insertion
    public void insertIntoDoublyLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createDoublyLinkedList(nodeValue);
            return;
        }
        else if (location == 0){
            node.next = head;
            node.previous = null;
            head.previous = node;
            head = node;
        }
        else if (location >=size){
            tail.next = node;
            node.previous = tail;
            tail = node;
            node.next = null;
        }else{
            Node temp = head;
            int index = 0;
            while (index<location-1) {
                temp = temp.next;
                index++;
            }
            temp.next.previous = node;
            node.next = temp.next;
            node.previous = temp;
            temp.next = node;
        }
        size++;
    }

    //traversal
    public void traverseDLL(){
        if (head == null){
            System.out.println("DLL doesnt exist");
            return;
        }
        Node temp = head;
        for (int i = 0 ; i <size; i++){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    //reverse traversal
    public void reverseTraversalDLL(){
        if (head == null){
            System.out.println("DLL doesnt exist");
            return;
        }
        Node temp = tail;
        for (int i = 0;i<size;i++){
            System.out.print(temp.value+ " <- ");
            temp = temp.previous;
        }
        System.out.println("\n");
    }

    //searching
    public boolean searchDoublyLinkedList(int nodeValue){
        if (head !=null){
            Node temp = head;
            for(int i = 0; i < size; i++){
                if (temp.value == nodeValue){
                    System.out.println("Found the node at location: "+i+"\n");
                    return true;
                }
                temp = temp.next;
            }
            System.out.println("Node not found.");
            return false;
        }
        System.out.println("CSLL doesn't exist");
        return false;
    }

    //deletion
    public void deleteDoublyLinkedList(int location){
        if (head == null){
            System.out.println("DLL doesn't exist");
            return;
        }
        if (location == 0){
            head = head.next;
            head.previous = null;
            size--;
            if (size ==0){
                head = tail = null;
                return;
            }
        }else if (location >= size){
            tail = tail.previous;
            tail.next = null;
            size--;
        }
        else{
            Node temp = head;
            for(int i = 0;i <location -1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.previous = temp;
            size--;
        }
    }

    public void deleteDoublyLinkedList(){
        Node temp = head;
        for(int i =0;i <size;i++){
            temp.previous = null;
            temp = temp.next;
        }
        head = tail = null;
        System.out.println("DLL is deleted");
    }

    public static void main(String[] args) {
        Doubly_Linked_List dLL = new Doubly_Linked_List();
        dLL.createDoublyLinkedList(1);
        dLL.insertIntoDoublyLinkedList(2, 0);
        dLL.insertIntoDoublyLinkedList(3, 1);
        dLL.insertIntoDoublyLinkedList(4, 7);
        dLL.traverseDLL();
        // dLL.reverseTraversalDLL();
        // dLL.searchDoublyLinkedList(3);
        dLL.deleteDoublyLinkedList(0);
        dLL.traverseDLL();
        dLL.deleteDoublyLinkedList();
        dLL.traverseDLL();
    }
}
