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
 * source: https://dzone.com/articles/doubly-linked-list-in-java
 */
public class DoubleLinkedList<Type> {
    private DoubleNode<Type> front;
    private int size;
    
    public DoubleLinkedList(){
        front = null;
    }
    
    public void addFront(Type x){
        if (isEmpty()){
            front = new DoubleNode<>(x);
        }
        else {
            DoubleNode<Type> temp = front;
            front = new DoubleNode<>(null, x, temp);
        }
        size++;
    }
    
    public void addEnd(Type x){
        if (isEmpty()){
            front = new DoubleNode<>(x);
        }
        else{
            DoubleNode<Type> temp = front;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new DoubleNode<>(temp, x, null);
        }
        size++;
    }
    
    public void addBefore(Type x, Type y){
        if(isEmpty()){
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        }
        
        DoubleNode<Type> current = front;
        
        while(current != null && !current.data.equals(x)){
            current = current.next;
        }
        
        if (current == null){
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        }
        
        DoubleNode<Type> newNode = new DoubleNode<>(current.prev, y, current);
        
        if(current.prev != null){
            current.prev.next = newNode;
        }
        else{
            front = newNode;
        }
        
        current.prev = newNode;
        size++;
    }
    
    public void addAfter(Type x, Type y){
        if(isEmpty()){
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        }
        
        DoubleNode<Type> current = front;
        
        while(current != null && !current.data.equals(x)){
            current = current.next;
        }
        
        if(current == null){
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        }
        
        DoubleNode<Type> newNode = new DoubleNode<>(current, y , current.next);
        if(current.next != null){
            current.next.prev = newNode;
        }
        
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
        
        DoubleNode<Type> current = front;
        
        while(current != null && !current.data.equals(x)){
            current = current.next;
        }
        
        if(current == null){
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        }
        
        if(current.next != null){
            current.next.prev = current.prev;
        }
        
        current.prev.next = current.next;
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
        DoubleNode<Type> temp = front;
        StringBuilder builder = new StringBuilder("[");
        
        while(temp != null){
            builder.append(temp.data).append(",");
            temp = temp.next;
        }
        
        return builder.toString() + "\b]";
    }
}
