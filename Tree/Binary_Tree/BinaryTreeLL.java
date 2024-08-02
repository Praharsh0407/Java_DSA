package Tree.Binary_Tree;

import java.util.*;
public class BinaryTreeLL {
    BinaryNode root;
    public BinaryTreeLL(){
        this.root = null;
    }

    //preorder traversal
    void preOrder(BinaryNode node) {
        if (node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //inorder traversal
    void inOrder(BinaryNode node) {
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    //postorder traversal
    void postOrder(BinaryNode node) {
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    //level traversal
    void levelOrder(BinaryNode node) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null){
                queue.add(presentNode.left);
            }
            if (presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    // search method
    public void search(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>(); 
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value){
                System.out.println("The value " + value + " is found in the Tree");
                return;
            } else{
                if (presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if (presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value "+value+ " is not found in Tree");
    }
    
    //Insert Method
    void Insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;;
        if (root == null){
            root = newNode;
            System.out.println("Inserted new Node at Root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newNode;
                System.out.println("Successfully inserted");
                break;
            }
            else if(presentNode.right == null){
                presentNode.right = newNode;
                System.out.println("Successfully inserted");
                break;
            }
            else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);  
            }
        }
    }

    //Get deepest Node
    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.left !=null){
                queue.add(presentNode.left);
            }
            if (presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    //delete deepestNode
    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        BinaryNode previousNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null){
                previousNode.right = null;
                return;
            }
            else if(presentNode.right == null){
                previousNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
            
        }
    }

    //delete given node
    public void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Node deleted");
                return;
            }
            else{
                if (presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null){
                    queue.add(presentNode.right);
                }

            }
        }
        System.out.println("Node doesnt exist");
    }

    //delete binary tree

    public void deleteBT(){
        root = null;
        System.out.println("BT deleted successfully");
    }
}
