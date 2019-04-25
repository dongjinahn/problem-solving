class Solution:
    def findComplement(self, num):
        num_binary = bin(num)[2::]
        com_str = ""
        for ch in num_binary:
            if ch == "0":
                com_str += "1"
            else:
                com_str += "0"
        return int(com_str, 2)
        """
        :type num: int
        :rtype: int
        """
        
