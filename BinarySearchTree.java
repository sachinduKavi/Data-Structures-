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
class NodeTree {
    int data;
    NodeTree left;
    NodeTree right;
    
    NodeTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
  
}


public class BinarySearchTree {
        NodeTree root;
        
        BinarySearchTree() {
            this.root = null;
        }
        
        public NodeTree insert(int data, NodeTree root) {
            if(root == null) {
                return new NodeTree(data);
            }
            
            if(root.data > data) {
                root.left = insert(data, root.left);
            } else {
                root.right = insert(data, root.right);
            }
            
            return root;           
        }
        
        
        public void preOrderTravasal(NodeTree node) {
            System.out.println(node.data);
            if(node.left != null) preOrderTravasal(node.left);
           if(node.right != null) preOrderTravasal(node.right);
        }
        
        
        public void inOrderTravasal(NodeTree node) {
            if(node.left != null) inOrderTravasal(node.left);
            System.out.println(node.data);
            if(node.right != null) inOrderTravasal(node.right);
        }
        
        
         public void postOrderTravasal(NodeTree node) {
            if(node.left != null) postOrderTravasal(node.left);
            if(node.right != null) postOrderTravasal(node.right);
            System.out.println(node.data);
        }
        
        
        
        
        public void preTravasal() {
            preOrderTravasal(this.root);
        }
        
        public void postTravasal() {
            postOrderTravasal(this.root);
        }
        
        public void inTravasal() {
            inOrderTravasal(this.root);
        }
       
        public void insert(int data) {
            this.root = insert(data, this.root);
        }
        
}
