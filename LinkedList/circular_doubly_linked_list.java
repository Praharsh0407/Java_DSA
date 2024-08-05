package LinkedList;
public class circular_doubly_linked_list {
    public class Node{
        public int value;
        public Node next;
        public Node previous;
    }
    public Node head;
    public Node tail;
    public int size;

    //creation
    public Node createCDLL(int nodeValue){
        Node node = new Node();
        node.next = node;
        node.previous = node;
        node.value = nodeValue;
        head = tail = node;
        size = 1;
        return head;
    }

    //insertion
    public void insertinCDLL(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head ==null){
            createCDLL(nodeValue);
            return;
        }
        if (location ==0){
            node.next = head;
            node.previous = tail;
            tail.next = node;
            head.previous = node;
            head = node;
        } else if(location >=size){
            node.previous = tail;
            node.next = head;
            tail.next = node;
            head.previous = node;
            tail = node;
        }else{
            Node temp = head;
            // int index = 0;
            for (int i = 0;i <location-1;i++){
                temp = temp.next;
                // index++;
            }
            node.next = temp.next;
            temp.next.previous = node;
            temp.next = node;
            node.previous = temp;
        }
        size++;
    }

    //traversal
    public void traversecdll(){
        if (head == null){
            System.out.println("CDLL doesnt exist");
            return;
        }
        Node temp = head;
        for (int i = 0; i <size;i++){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    //reverse traversal
    public void reversetraversal(){
        if (tail == null){
            System.out.println("CDLL doesnt exist");
            return;
        }
        Node temp = tail;
        for (int i =0; i < size; i++){
            System.out.print(temp.value+ " <- ");
            temp = temp.previous;
        }
        System.out.println();
    }

    //searching
    public boolean searchCircularDoublyLinkedList(int value){
        if ( head == null){
            System.out.println("CDLL doesnt exist");
            return false;
        }
        Node temp = head;
        for(int i = 0; i < size; i++){
            if (temp.value == value){
                System.out.println("Node found at location: " + i);
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Node not found");
        return false;
    }

    //deletion
    public void deleteinCDLL(int location){
        if (head == null){
            System.out.println("CDLL doesnt exist");
            return;
        }
        if (location == 0){
            if (size ==1){
                head = tail = head.next = head.previous = null;
                size--;
                return;
            }
            head = head.next;
            tail.next = head;
            head.previous = tail;
            size--;
        }
        else if(location >=0){
            if (size ==1){
                head = tail = head.next = head.previous = null;
                size--;
                return;
            }
            tail = tail.previous;
            tail.next = head;
            head.previous = tail;
            size--;
        }
        else{
            Node temp = head;
            for(int i = 0; i <  location-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.previous = temp;
            size--;
        }
    }

    //delete entire linked list
    public void deleteCDLL(){
        Node temp = head;
        for (int i = 0 ; i <size; i++){
            temp.previous = null;
            temp = temp.next;
        }
        head = tail = null;
        System.out.println("CDLL Deleted");
    }

    public static void main(String[] args) {
        circular_doubly_linked_list cdll = new circular_doubly_linked_list();
        cdll.createCDLL(1);
        cdll.insertinCDLL(2,0);
        cdll.insertinCDLL(3,2);
        cdll.insertinCDLL(4, 5);
        cdll.traversecdll();
        cdll.deleteinCDLL(0);
        cdll.traversecdll();
        cdll.deleteCDLL();
        cdll.traversecdll();
    }
    
}