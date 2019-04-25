def getLetterMap(s):
    letter_map = dict()
    for ch in s:
        if ch in letter_map:
            letter_map[ch] = letter_map[ch] + 1
        else:
            letter_map[ch] = 1
    
    return letter_map

class Solution(object):
    
    def canConstruct(self, ransomNote, magazine):
        ransom_map = getLetterMap(ransomNote)
        magazine_map = getLetterMap(magazine)

        for ch in ransom_map:
            if not ch in magazine_map:
                return False
            if ransom_map[ch] > magazine_map[ch]:
                return False

        return True<Paste>
