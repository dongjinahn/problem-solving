def count_map(l):
    m = {}
    for item in l:
        if item in m:
            m[item] = m[item] + 1
        else:
            m[item] = 1
    return m


class Solution(object):
    def intersect(self, nums1, nums2):
        m1 = count_map(nums1)
        m2 = count_map(nums2)
        result_list = []
        for k1 in m1:
            if not k1 in m2:
                continue
            v1 = m1[k1]
            v2 = m2[k1]
            min_count = min(v1, v2)
            result_list.extend([k1] * min_count)
        return result_list
