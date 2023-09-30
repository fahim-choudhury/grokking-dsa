package twoPointers.validPalindrome2

/**
 * LeetCode: 680. Valid Palindrome II
 * https://leetcode.com/problems/valid-palindrome-ii/description/
 */
class Solution {
    fun validPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left <= right) {
            if (s.length == 1) return true

            if (s[left] == s[right]) {
                left++
                right--
                continue
            }

            val leftSkipped = s.substring(left + 1, right + 1)
            val rightSkipped = s.substring(left, right)

            return (leftSkipped == leftSkipped.reversed()) or (rightSkipped == rightSkipped.reversed())
        }
        return true
    }
}