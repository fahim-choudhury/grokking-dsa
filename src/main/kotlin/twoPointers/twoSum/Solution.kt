package twoPointers.twoSum

/**
 * LeetCode 1. Two Sum
 * https://leetcode.com/problems/two-sum/description/
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sortedInput: IntArray = nums.sortedArray()

        var start = 0
        var end = nums.lastIndex

        while (start <= end) {
            val sum = sortedInput[start] + sortedInput[end]
            if (sum == target) {
                val i = nums.indexOfFirst { it == sortedInput[start] }
                val j = nums.indexOfLast { it == sortedInput[end] }
                return intArrayOf(i, j)
            } else if (sum < target) {
                start++
            } else {
                end--
            }

        }
        return intArrayOf()
    }
}