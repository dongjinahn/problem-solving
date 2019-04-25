def count_map(l):
    m = {}
    for item in l:
        if item in m:
            m[item] = m[item] + 1
        else:
            m[item] = 1
    return m
    
        
class Solution(object):
    def findTheDifference(self, s, t):
        s_map = count_map(s)
        # print("s_map", s_map)
        t_map = count_map(t)
        # print("t_map", t_map)
        for key in t_map:
            if not key in s_map:
                return key
            t_map[key] = t_map[key] - s_map[key]
            if t_map[key] == 1:
                return key
