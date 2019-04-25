def make_count_map(string):
    count_map = {}
    
    for word in string.split():
        if word in count_map:
            count_map[word] = count_map[word] + 1
        else:
            count_map[word] = 1
    return count_map

class Solution(object):
    def uncommonFromSentences(self, A, B):
        a_count_map = make_count_map(A)
        b_count_map = make_count_map(B)
        
        res = set()
        for a_word in a_count_map:
            a_count = a_count_map[a_word]
            if a_count == 1 and not a_word in b_count_map:
                res.add(a_word)
            b_count_map.pop(a_word, None)
        
        for b_word in b_count_map:
            b_count = b_count_map[b_word]
            if b_count == 1 and not b_word in a_count_map:
                res.add(b_word)
        
        return list(res)
        """
        :type A: str
        :type B: str
        :rtype: List[str]
        """
        
