/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.NoSuchElementException;

/**
 *
 * @author Kakatuahitam
 */
public class SingleLinkedList<Type> {
    private SingleNode<Type> front;
    private int size;
    
    public SingleLinkedList(){
        front = null;
    }
    
    public void addFront(Type x){
        if (isEmpty()){
            front = new SingleNode<>(x);
        }
        
        else{
           SingleNode<Type> temp = front;
           front = new SingleNode<>(x, temp);
        }
        size++;
    }
    
    public void addEnd(Type x){
        if (isEmpty()){
            front = new SingleNode<>(x);
        }
        else{
            SingleNode<Type> temp = front;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new SingleNode<>(x, null);
        }
        size++;
    }
    
    public void addBefore(Type x, Type y){
        if(isEmpty()){
            throw new NoSuchElementException("List is empty");
        }
        
        SingleNode<Type> current = front;
        
        if (current.data == x){
            addFront(y);
        }
        else{
            SingleNode<Type> parent = null;
            
            while(current != null && !current.data.equals(x)){
                parent = current;
                current = current.next;
            }
            
            if (current != null){
                parent.next = new SingleNode(y, current);
                size++;
            }
            else{
                throw new NoSuchElementException("Node" + x.toString() + "not found");
            }
        }
    }    
            
    public void addAfter(Type x, Type y){
        if(isEmpty()){
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        }
        
        SingleNode<Type> current = front;
        
        while(current != null && !current.data.equals(x)){
            current = current.next;
        }
        
        if(current == null){
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        }
        
        SingleNode<Type> newNode = new SingleNode<>(y, current.next); 
        
        current.next = newNode;
        size++;
        
    }
    
    public void remove(Type x){
        if(isEmpty()){
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        }
        
        if (front.data.equals(x)){
            front = front.next;
            return;
        }
        
        SingleNode<Type> current = front;
        SingleNode<Type> currbefore = new SingleNode<>(null, current);
        
        while(current != null && !current.data.equals(x)){
            current = current.next;
            currbefore = currbefore.next;
        }
        
        if(current == null){
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        }
        
        currbefore.next = current.next;
        
        size--;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }
    
    @Override
    public String toString() {
        SingleNode<Type> temp = front;
        StringBuilder builder = new StringBuilder("[");
        
        while(temp != null){
            builder.append(temp.data).append(",");
            temp = temp.next;
        }
        
        return builder.toString() + "\b]";
    }
}
