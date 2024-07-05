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
public class Runnable {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        tree.insert(5);
        tree.insert(10);
        tree.insert(7);
        tree.insert(15);
        tree.insert(2);
         tree.insert(8);
          tree.insert(4);
        
        
        
        tree.callPreorder();

//    tree.callInorder();
        
        
    }
}
