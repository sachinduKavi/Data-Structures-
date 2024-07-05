/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastrucutures;

/**
 *
 * @author Sachindu Kavishka
 */
class Node {
    int data;
    Node right;
    Node left;
    
    Node(int data) {
        this.data = data;
        this.right = this.left = null;
    }
    
    
    public void preOrderTravasal() {
            System.out.print(this.data + ", ");
            if(this.left != null) this.left.preOrderTravasal();
            if(this.right != null) this.right.preOrderTravasal();
    }
    
    
    public void inOrderTravasal() {
            if(this.left != null) this.left.preOrderTravasal();
            System.out.print(this.data + ", ");
            if(this.right != null) this.right.preOrderTravasal();
    }
    
}


public class BinaryTree {
    Node root;
    
    BinaryTree() {
        this.root = null;
    }
    
    public Node insert(int data, Node root) {
        // If root node is null
        if(root == null) {
            root = new Node(data);
            return root;
        }
        
        // Check the tree
        if(root.data > data) {
            // Insert to left hand side 
            root.left = insert(data, root.left);
        } else {
            // Insert to right hand side of the root node
            root.right = insert(data, root.right);
        }
        
        return root;
        
    }
    
    public void insert(int data) {
        this.root = insert(data, this.root);
    }
    
    
    public void callPreorder() {
        if(this.root != null)
            this.root.preOrderTravasal();
        else 
            System.out.println("Tree is null");
    }
    
    
    public void callInorder() {
        if(this.root != null)
            this.root.inOrderTravasal();
        else 
            System.out.println("Tree is null");
    }
    
    
    
    
    
}
