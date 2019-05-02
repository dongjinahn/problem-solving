class ListNode(object):
  def __init__(self, x):
    self.val = x
    self.next = None

  def print(self):
    cur = self
    while cur != None:
      print(cur.val, ', ', end='')
      cur = cur.next
    print()

def middleNode(head):
  l = []
  cur = head
  while cur != None:
    l.append(cur)
    cur = cur.next
  return l[len(l) // 2]

def test(head):
  print("testing: ", end="")
  head.print()
  print("result: ", end="")
  middleNode(head).print()

a = ListNode(1)
a.next = ListNode(2)
a.next.next = ListNode(3)
a.next.next.next = ListNode(4)
a.next.next.next.next = ListNode(5)

test(a)

b = ListNode(1)

b.next = ListNode(2)
b.next.next = ListNode(3)
b.next.next.next = ListNode(4)
b.next.next.next.next = ListNode(5)
b.next.next.next.next.next = ListNode(6)

test(b)

