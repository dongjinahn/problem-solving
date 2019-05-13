# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isUniValueNode(self, node):
        if node.left == None and node.right == None:
            return True
        if node.left == None:
            return node.val == node.right.val
        if node.right == None:
            return node.val == node.left.val
        return node.val == node.left.val and node.val == node.right.val

    def isUnivalTree(self, root: TreeNode) -> bool:
        stack = []
        stack.append(root)

        while len(stack) != 0:
            popped = stack.pop(0)
            if not self.isUniValueNode(popped):
                return False
            if popped.left != None:
                stack.append(popped.left)
            if popped.right != None:
                stack.append(popped.right)

        return True

