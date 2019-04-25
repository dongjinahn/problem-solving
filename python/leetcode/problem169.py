class Solution:
    def majorityElement(self, nums):
        dic = {}
        for num in nums:
            if num in dic:
                new_value = dic[num] + 1
                dic[num] = new_value
            else:
                dic[num] = 1

        max_key = -1
        max_count = -1
        for key in dic.keys():
            count = dic[key]
            if count > max_count:
                max_key = key
                max_count = count
        return max_key
