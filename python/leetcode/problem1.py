class Solution(object):
    def twoSum(self, nums, target):
        dic = dict()
        i = 0
        for num in nums:
            complement = target - num
            if complement in dic:
                return [dic[complement], i]
            else:
                dic[num] = i
            i += 1

        return [-1, -1]
