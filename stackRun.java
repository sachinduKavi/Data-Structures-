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
public class stackRun {
    public static void main(String[] args) {
          Stack<String> stack = new Stack<String>(5);
          
          stack.push("Sachindu");
          stack.push("Gona");
          stack.push("Chethana");
          stack.push("Shammi");
          stack.push("Mii haraka");
//          stack.push(9);

           System.out.println(stack.pop());
           System.out.println(stack.pop());
           System.out.println(stack.pop());
           System.out.println(stack.pop());
    }
}
