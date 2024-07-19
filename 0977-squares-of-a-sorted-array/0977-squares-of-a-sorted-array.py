class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        nums = sorted([num**2 for num in nums])
        return nums
        