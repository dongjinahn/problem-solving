class Solution:
  def findCommonPrefix(self, a, b):
    i = 1
    cp = ""
    while i <= len(b):
      subB = b[0:i]
      if a.startswith(subB):
        cp = subB
      else:
        break

      i += 1
    return cp
  def longestCommonPrefix(self, strs):
      if len(strs) == 0:
        return ""
      if len(strs) == 1:
        return strs[0]

      i = 2
      commonPrefix = self.findCommonPrefix(strs[0], strs[1])
      while len(commonPrefix) != 0 and i < len(strs):
        commonPrefix = self.findCommonPrefix(commonPrefix, strs[i])
        i += 1
      return commonPrefix