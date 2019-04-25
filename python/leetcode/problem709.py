import string
converter_dict = dict()
for ch in string.ascii_lowercase:
    converter_dict[ch.upper()] = ch
    
class Solution(object):
    def toLowerCase(self, str):
        answer_str = ""
        for ch in str:
            if ch in converter_dict:
                answer_str += converter_dict[ch]
            else:
                answer_str += ch
        return answer_str
        <Paste>
