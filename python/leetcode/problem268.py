def sigma_n(n):
    return int(n * (n + 1) / 2)


class Solution(object):
    def missingNumber(self, nums):
        expected_sum = sigma_n(len(nums))
        real_sum = sum(nums)
        return expected_sum - real_sum
        """
        :type nums: List[int]
        :rtype: int
        """
        
