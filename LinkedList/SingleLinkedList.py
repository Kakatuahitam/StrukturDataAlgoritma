# -*- coding: utf-8 -*-
"""
Created on Tue Jun  2 04:21:29 2020

@author: Kakatuahitam
"""
from SingleNode import SingleNode as sn

class SingleLinkedList():
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
            self.front = sn(x)
        else:
            temp = self.front
            self.front = sn(x, temp)
        self.size += 1
        
    def addEnd(self, x):
        if self.isEmpty():
            self.front = sn(x)
        else:
            temp = self.front
            while temp.next != None:
                temp = temp.next
                
            temp.next = sn(x, None)
            
        self.size += 1
        
    def addBefore(self, x, y):
        if self.isEmpty():
            print("can't add", y, "before", x, "\nlist ls empty")
            
        current = self.front
        if current.data == x:
            self.addFront(y)
            
        else:
            parent = None
            
            while current != None and not(current.data == x):
                parent = current
                current = current.next
            
            if current != None:
                parent.next = sn(y, current)
                self.size += 1
            else:
                print("no node")
                return
    
    def addAfter(self, x, y):
        if self.isEmpty():
            print("can't add", y, "after", x, "\nlist ls empty")
        
        current = self.front
        while current != None and not (current.data == x):
            current = current.next
        
        if current == None:
            print("no", x,"node")
            
        newNode = sn(y, current.next)
        current.next = newNode
        self.size += 1
        
    def remove(self, x):
        if self.isEmpty():
            print("can't remove", x, "\nlist ls empty")
        
        if self.front.data == x:
            self.front = self.front.next
            return
        
        current = self.front
        currbefore = sn(next = current)
        
        while current != None and not (current.data == x):
            current = current.next
            currbefore = currbefore.next
            
        if current == None:
            print("no node")
            return
        
        currbefore.next = current.next
        self.size -= 1
      
    def isEmpty(self):
        return self.size == 0
    
    def wSize(self):
        return self.size