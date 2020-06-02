# -*- coding: utf-8 -*-
"""
Created on Tue Jun  2 16:51:30 2020

@author: Kakatuahitam
"""


class DoubleNode:
    def __init__(self, prev = None, data = None, next = None):
        self.prev = prev
        self.data = data
        self.next = next
        
    def __repr__(self):
        return repr(self.data)