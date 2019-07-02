class Solution:
  def maxArea(self, heightList) -> int:
    max = 0
    a = 0
    b = len(heightList) - 1
    while a != b:
      heightA = heightList[a]
      heightB = heightList[b]
      area = min([heightA, heightB]) * (b - a)
      if area > max:
        max = area
      if heightB > heightA:
        a = a +  1
      else:
        b = b - 1
    return max

