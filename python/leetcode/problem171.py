class Solution(object):
    def titleToNumber(self, s):
        index = 1
        res = 0
        capital_a_in_ascii_code = ord('A') - 1
        for ch in s[::-1]:
            res += index * (int(ord(ch)) - capital_a_in_ascii_code)
            index *= 26
        return res
