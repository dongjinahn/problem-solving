import heapq

class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        heap = []

        for i in A:
            heapq.heappush(heap, i ** 2)

        res = []
        while heap:
            res.append(heapq.heappop(heap))
        return res
