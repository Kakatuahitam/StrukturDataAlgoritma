/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Kakatuahitam
 */
class SingleNode<Type> {
    Type data;
    SingleNode<Type> next;
    
    SingleNode(Type data){
        this(data, null);
    }
    
    SingleNode(Type data, SingleNode<Type> next){
        this.data = data;
        this.next = next;
    }
}