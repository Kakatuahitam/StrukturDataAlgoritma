# -*- coding: utf-8 -*-
"""
Created on Tue Jun  2 04:31:00 2020

@author: Kakatuahitam
"""


from SingleLinkedList import SingleLinkedList as sll
from DoubleLinkedList import DoubleLinkedList as dll

s_list = sll()
d_list = dll()

s_list.addEnd(10)
d_list.addEnd(10)
print(s_list, s_list.wSize())
print(d_list, d_list.wSize())

s_list.addAfter(10, 89)
d_list.addAfter(10, 89)
print(s_list, s_list.wSize())
print(d_list, d_list.wSize())

s_list.addBefore(89, 88)
d_list.addBefore(89, 88)
print(s_list, s_list.wSize())
print(d_list, d_list.wSize())

s_list.addAfter(88, 1)
d_list.addAfter(88, 1)
print(s_list, s_list.wSize())
print(d_list, d_list.wSize())

s_list.remove(89)
d_list.remove(89)
print(s_list, s_list.wSize())
print(d_list, d_list.wSize())

s_list.addBefore(10, "head")
d_list.addBefore(10, "head")
print(s_list, s_list.wSize())
print(d_list, d_list.wSize())

s_list.addBefore(1, "last-1")
d_list.addBefore(1, "last-1")
print(s_list, s_list.wSize())
print(d_list, d_list.wSize())

# %%
if not(False == False):
    print("false")