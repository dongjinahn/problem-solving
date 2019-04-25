class Solution:
    def powerfulIntegers(self, x, y, bound):
        result_set = set()

        # x^a + y^b < bound
        a = 0
        while x ** a <= bound:
            b = 0
            while x ** a + y ** b <= bound:
                result_set.add(x ** a + y ** b)
                b = b + 1
                if y == 1:
                    break
            if x == 1:
                break
            a = a + 1

        result_list = list(result_set)
        result_list.sort()
        return result_list
        
