def search(c, i, sum, t, cur_list, res_list):
    if sum > t:
        return
    if sum == t:
        res_list.append(cur_list.copy())
        return
    k = i
    while k < len(c):
        cur_list.append(c[k])
        search(c, k, sum + c[k], t, cur_list, res_list)
        cur_list.pop()
        k += 1

class Solution:
    def combinationSum(self, candidates, target):
        res_list = []
        search(candidates, 0, 0, target, [], res_list)
        return res_list
