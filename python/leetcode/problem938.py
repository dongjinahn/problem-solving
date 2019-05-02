# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def rangeSumBST(self, root, L, R):
        if root == None:
            return 0
        if root.val < L:
            return self.rangeSumBST(root.right, L, R)
        if root.val > R:
            return self.rangeSumBST(root.left, L, R)
        leftSum = self.rangeSumBST(root.left, L, R)
        rightSum = self.rangeSumBST(root.right, L, R)
        selfSum = root.val if root.val >= L and root.val <= R else 0
        return leftSum + selfSum + rightSum