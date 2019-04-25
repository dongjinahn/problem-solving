class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        binary = "{:032b}".format(n)
        # print("binary", binary, len(binary))
        reverse = binary[::-1]
        # print("reverse", reverse)
        return int(reverse, 2)
