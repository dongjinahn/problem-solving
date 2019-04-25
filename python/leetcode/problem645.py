class Solution(object):
    def findErrorNums(self, nums):
        initial_num_set = set()
        for i in range(len(nums)):
            initial_num_set.add(i + 1)

        duplicated_num = None
        missing_num = None
        test_set = set()
        for num in nums:
            if num in initial_num_set:
                initial_num_set.remove(num)
            
            if num in test_set:
                duplicated_num = num
            else:
                test_set.add(num)
        missing_num = initial_num_set.pop()
        return [duplicated_num, missing_num]
        
