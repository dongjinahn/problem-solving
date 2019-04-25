class LargerNumKey(str):
    def __lt__(x, y):
        return x+y > y+x
    
class Solution(object):
    def largestNumber(self, nums):
        strs = [str(x) for x in nums]
        strs.sort(key=LargerNumKey)
        res = "".join(strs)
        if len(res) > 1 and res[0] == '0':
            return '0'
        else:
            return res
