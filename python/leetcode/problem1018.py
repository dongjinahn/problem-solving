class Solution:
    def prefixesDivBy5(self, A: List[int]) -> List[bool]:
        sum = 0
        res = []
        for n in A:
          	if n % 2 == 0:
            	sum = sum * 2
          	else:
 	           sum = sum * 2 + 1
    	    res.append(sum % 5 == 0)
        return res;
          