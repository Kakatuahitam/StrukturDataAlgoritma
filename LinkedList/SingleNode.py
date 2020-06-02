# -*- coding: utf-8 -*-
"""
Created on Tue Jun  2 04:11:55 2020

@author: Kakatuahitam
"""


class SingleNode:
    def __init__(self, data = None, next = None):
        self.data = data
        self.next = next
        
    def __repr__(self):
        return repr(self.data)