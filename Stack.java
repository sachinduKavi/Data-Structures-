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
public class Stack<DataType> {
    
    DataType[] array;
    int size, top = -1;
    
    Stack(int size) {
        this.size = size;
        this.array = (DataType[]) new Object[size];
    }
    
    
    public boolean isFull() {
        return top == size -1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    
    public DataType pop() {
        if(!this.isEmpty()) {
            return array[top--];
        } else {
            // Stack is empty Underflow
            System.out.println("Stack is empty Underflow condition");
            
        }
        return null;
    }
    
    
    public void push(DataType value) {
        if(!this.isFull()) {
            this.array[++top] = value;
        } else {
            // Stack is full overflow condition 
            System.out.println("Overflow stack is full");
        }
    }
}
