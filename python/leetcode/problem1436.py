class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        s = set()
        d = set()
        for [a, b] in paths:
            s.add(a)
            d.add(b)
        return list(d.difference(s))[0]