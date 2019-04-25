def isSelfDividingNumber(num):
    original_num = num
    while num > 0:
        cur_digit = num % 10
        if cur_digit == 0:
            return False
        if original_num % cur_digit != 0:
            return False
        num = int(num / 10)    
    return True

class Solution(object):
    def selfDividingNumbers(self, left, right):
        answer_list = []
        for i in range(left, right + 1):
            if isSelfDividingNumber(i):
                answer_list.append(i)
        return answer_list
        
