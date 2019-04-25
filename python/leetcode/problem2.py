# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

def convertListNodeToNumber(node):
    result = 0
    cur = node
    result += cur.val
    index = 10
    while cur.next != None:
        result += cur.next.val * index
        index *= 10
        cur = cur.next
    return result

def convertNumberToListNode(num):
    if num == 0:
        return ListNode(0)
    dummy = ListNode(0)
    cur = dummy
    while num > 0:
        val = num % 10
        cur.next = ListNode(val)
        cur = cur.next
        num = int(num / 10)
    return dummy.next

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        n1 = convertListNodeToNumber(l1)
        n2 = convertListNodeToNumber(l2)
        return convertNumberToListNode(n1 + n2)
