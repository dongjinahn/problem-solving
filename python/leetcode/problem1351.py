class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        count = 0 
        for inner_grid in grid:
            for element in inner_grid:
                if element < 0:
                    count += 1
        return count
                
        
