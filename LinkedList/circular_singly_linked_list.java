package LinkedList;
public class circular_singly_linked_list {
    public class Node{
        public int value;
        public Node next;
    }

    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertIntoCSLL(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if (head == null){
            createCSLL(nodeValue);
            return;
        }
        if (location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >=size){
            tail.next = node;
            tail = node;
            tail.next = head;
        } else{
            Node temp = head;
            for(int i = 0; i < location-1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }

    public void traverseCSLL(){
        if (head == null){
            System.out.println("CSLL doesnot exist");
            return;
        }
        Node temp = head;
        for (int i = 0; i <size; i++){
            System.out.print(temp.value+ " -> ");
            temp= temp.next;
        }
        System.out.println("\n");
    }

    public boolean searchCSLL(int nodevalue){
        if (head!=null){
            Node temp = head;
            for (int i = 0; i < size; i++){
                if (temp.value == nodevalue){
                    System.out.println("Found the node at location: "+i+"\n");
                    return true;
                }
                temp= temp.next;
            }
            System.out.println("Node not found.");
            return false;
        }
        System.out.println("CSLL doesn't exist");
        return false;
    }

    public void deletionofNode(int location){
        if (head==null){
            System.out.println("CSLL doesn't exist");
            return;
        }
        if (location == 0){
            head = head.next;
            tail.next = head;
            size--;
            if (size ==0){
                tail = head.next = head = null;
            }
        } else if (location >= size){
            Node temp = head;
            for (int i=0; i < size-1; i++){
                temp = temp.next;
            }
            if (temp == head){
                head.next = null;
                head = null;
                size--;
                return;
            }
            temp.next = head;
            tail = temp;
            size--;
        } else{
            Node temp = head;
            for(int i=0; i < location-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void deleteCSLL(){
        if (head == null){
            System.out.println("CSLL didnt exist from beginning");
            return;
        }
        head = tail = tail.next = null;
        System.out.println("CSLL deleted successfully");
    }

    public static void main(String[] args) {
        circular_singly_linked_list csll = new circular_singly_linked_list();
        csll.createCSLL(5);
        csll.insertIntoCSLL(4, 0);
        csll.insertIntoCSLL(6, 1);
        csll.insertIntoCSLL(7, 8);
        // System.out.println(csll.head.value);
        // System.out.println(csll.head.next.value);
        // System.out.println(csll.head.next.next.value);
        // System.out.println(csll.head.next.next.next.value);
        csll.traverseCSLL();
        // csll.searchCSLL(4);

        csll.deletionofNode(1);
        csll.traverseCSLL();
        csll.deleteCSLL();
        csll.traverseCSLL();

    }
    
}
