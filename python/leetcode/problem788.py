my_dic = dict()
my_dic[0] = 0
my_dic[1] = 1
my_dic[2] = 5
my_dic[5] = 2
my_dic[6] = 9
my_dic[8] = 8
my_dic[9] = 6

def isRotatingDigit(num):
    original_num = num
    index = 1
    converted_num = 0
    while num > 0:
        cur_digit = num % 10
        if cur_digit not in my_dic:
            return False
        converted_num += my_dic[cur_digit] * index
        num = int(num / 10)
        index *= 10
    return converted_num != original_num

class Solution(object):
    def rotatedDigits(self, num):
        count = 0
        for i in range(1, num + 1):
            if isRotatingDigit(i):
                count += 1
        return count
        
