class Solution(object):
    def mostCommonWord(self, paragraph, banned):
        p = paragraph.lower()
        for punc in "!?',;.":
            p = p.replace(punc, " ")
        tokens = p.split()
        words = [x.strip() for x in tokens]
        
        count_map = {}
        banned_set = set(banned)
        for word in words:
            if word in banned_set:
                continue
            if word in count_map:
                count_map[word] = count_map[word] + 1
            else:
                count_map[word] = 1
        
        max_word = None
        max_count = -1
        for word in count_map:
            count = count_map[word]
            if count > max_count:
                max_word = word
                max_count = count
        return max_word
        
