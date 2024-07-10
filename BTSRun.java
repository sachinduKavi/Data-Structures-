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
public class BTSRun {
    public static void main(String[] args) {
        BinarySearchTree binarySearch = new BinarySearchTree();
        
        binarySearch.insert(34);
        binarySearch.insert(15);
        binarySearch.insert(6);
        binarySearch.insert(22);
        binarySearch.insert(18);
        binarySearch.insert(81);
        binarySearch.insert(87);
        binarySearch.insert(79);
        
//        binarySearch.preTravasal();
        binarySearch.postTravasal();
    }
}
