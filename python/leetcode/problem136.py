class Solution(object):
    def singleNumber(self, nums):
        s = set()
        for num in nums:
            if num in s:
                s.remove(num)
            else:
                s.add(num)
        return s.pop()
