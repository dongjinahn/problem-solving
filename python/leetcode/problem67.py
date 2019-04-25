class Solution:
    def addBinary(self, a, b):
        a_num = int(a, 2)
        b_num = int(b, 2)
        return bin(a_num + b_num)[2::]
