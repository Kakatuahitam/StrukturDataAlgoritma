/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Kakatuahitam
 * source: https://dzone.com/articles/doubly-linked-list-in-java
 */
class DoubleNode<Type> {
    Type data;
    DoubleNode<Type> next;
    DoubleNode<Type> prev;
    
    DoubleNode(Type data){
        this(null, data, null);
    }
    
    DoubleNode(DoubleNode<Type> prev, Type data, DoubleNode<Type> next){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
