public class Singly_Linked_List {

    public class Node{
        public int value;
        public Node next;
    }

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        // head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;

    }

    //insertion
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location ==0){
            node.next = head;
            head = node;
        } else if (location >=size){
            node.next = null;
            tail.next = node;
            tail = node;
        } else{
            Node temp = head;
            int index = 0;
            while(index <location-1){
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }

    //traverse
    public void traverseLinkedList(){
        if (head == null){
            System.out.println("SLL doesnot exist");
            return;
        }
        Node temp = head;
        for(int i = 0; i <size; i++){
            System.out.print(temp.value + " -> ");

            temp=temp.next;
        }
        System.out.println("\n");
    }


    //searching
    public boolean searchLinkedList(int nodeValue){
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

    // deletion
    public void deletionOfNode(int location){
        if (head == null){
            System.out.println("SLL doesnnt exist");
            return;
        }
        if (location == 0){
            head = head.next;
            size--;
            if (size ==0){
                head= tail =null;
                return;
            }
        } else if (location >=size){
            Node temp = head;
            for (int i = 0; i <size-1;i++){
                temp = temp.next;
            }
            if (temp ==head){
                tail =head =null;
                size--;
                return;
            }
            temp.next = null;
            tail = temp;
            size--;
        } else{
            Node temp = head;
            for (int i = 0; i < location-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    //delete entire linkedlist
    public void deleteSLL(){
        head = tail = null;
        System.out.println("SLL deleted successfully");
    }


    public static void main(String[] args) {
        Singly_Linked_List sLL = new Singly_Linked_List();
        sLL.createSinglyLinkedList(5);
        // System.out.println(sLL.head.value);

        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(7,2);
        sLL.insertInLinkedList(8,4);
        sLL.insertInLinkedList(9,3);

        // System.out.println(sLL.tail.value);
        sLL.traverseLinkedList();
        // sLL.searchLinkedList(9);
        // sLL.deletionOfNode(1);
        sLL.deleteSLL();
        sLL.traverseLinkedList();



    }
}
