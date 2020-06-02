# -*- coding: utf-8 -*-
"""
Created on Tue Jun  2 16:57:43 2020

@author: Kakatuahitam
"""
from DoubleNode import DoubleNode as dn

class DoubleLinkedList:
    def __init__(self):
        self.front = None
        self.size = 0
        
    def __repr__(self):
        nodes = []
        curr = self.front
        while curr:
            nodes.append(repr(curr))
            curr = curr.next
        return '[' + ', '.join(nodes) + ']'
    
    def addFront(self, x):
        if self.isEmpty():
            self.front = dn(data = x)
        else:
            temp = self.front
            self.front = dn(None, x, temp)
            
        self.size += 1
        
    def addEnd(self, x):
        if self.isEmpty():
            self.front = dn(data = x)
        else:
            temp = self.front
            while temp.next != None:
                temp = temp.next
                
            temp.next = dn(temp, x, None)
        
        self.size += 1
        
    def addBefore(self, x, y):
        if self.isEmpty():
            print("list is empty, operation addBefore cant be done")
            return
        
        current = self.front
        while current != None and not (current.data == x):
            current = current.next
            
        if current == None:
            print("no", x,"node, operation addBefore cant be done")
            return
            
        newNode = dn(current.prev, y, current)
        if current.prev != None:
            current.prev.next = newNode
        else:
            self.front = newNode
        
        current.prev = newNode
        self.size += 1
        
    def addAfter(self, x, y):
        if self.isEmpty():
            print("list is empty, operation addAfter cant be done")
            return
        
        current = self.front
        while current != None and not (current.data == x):
            current = current.next
        
        if current == None:
            print("no", x, "node, operation addAfter cant be done")
            return
        
        newNode = dn(current, y, current.next)
        if current.next != None:
            current.next.prev = newNode
            
        current.next = newNode
        self.size += 1
        
    def remove(self, x):
        if self.isEmpty():
            print("nothing to be removed, list is empty")
            return
        
        if self.front.data == x:
            self.front = self.front.next
            return
        
        current = self.front
        while current != None and not (current.data == x):
            current = current.next
            
        if current == None:
            print("node is already extinct in this list")
            return
        
        if current.next != None:
            current.next.prev = current.prev
            
        current.prev.next = current.next
        self.size -= 1
    
    def isEmpty(self):
        return self.size == 0
    
    def wSize(self):
        return self.size
