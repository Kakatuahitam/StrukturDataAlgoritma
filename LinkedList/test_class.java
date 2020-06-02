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
public class test_class {
    
    
    public static void main(String[] args) {
        SingleLinkedList single_link = new SingleLinkedList();
        DoubleLinkedList double_link = new DoubleLinkedList();
        
        single_link.addEnd(10);
        double_link.addEnd(10);
        
        System.out.println(single_link.toString() + single_link.size());
        System.out.println(double_link.toString() + double_link.size());
        
        single_link.addAfter(10, 89);
        double_link.addAfter(10, 89);
        
        System.out.println(single_link.toString() + single_link.size());
        System.out.println(double_link.toString() + double_link.size());
        
        single_link.addBefore(89, 88);
        double_link.addBefore(89, 88);
        
        System.out.println(single_link.toString() + single_link.size());
        System.out.println(double_link.toString() + double_link.size());
        
        single_link.addAfter(88, 1);
        double_link.addAfter(88, 1);
        
        System.out.println(single_link.toString() + single_link.size());
        System.out.println(double_link.toString() + double_link.size());
        
        single_link.remove(89);
        double_link.remove(89);
        
        System.out.println(single_link.toString() + single_link.size());
        System.out.println(double_link.toString() + double_link.size());
        
        single_link.addBefore(10, "head");
        double_link.addBefore(10, "head");
        
        System.out.println(single_link.toString() + single_link.size());
        System.out.println(double_link.toString() + double_link.size());
        
        single_link.addBefore(1, "last-1");
        double_link.addBefore(1, "last-1");
        
        System.out.println(single_link.toString() + single_link.size());
        System.out.println(double_link.toString() + double_link.size());
    }
}
