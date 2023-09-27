package twoPointers.validPalindrome

import java.util.*

/**
 * LeetCode: 125. Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/description/
 */

class Solution {
    fun isPalindrome(s: String): Boolean {
        if (s.length == 1) return true

        val input = sanitizeString(s)

        // Initialize two pointers at the beginning and end
        var leftPointer = 0
        var rightPointer = input.length - 1

        // Iterate until the left pointer and right pointer reaches
        // at the middle or cross each other
        while (leftPointer <= rightPointer) {
            // If the two pointers don't match, the string is not a palindrome
            if (input[leftPointer] != input[rightPointer]) return false

            // Left pointer goes forward, right pointer goes backward
            leftPointer += 1
            rightPointer -= 1
        }
        // Loop finishes with no mismatch, so its a palindrome
        return true
    }

    /**
     * Modifies the input with all lower case and no special characters,
     * containing only letters and digits
     */
    private fun sanitizeString(input: String): String {
        return input.lowercase(Locale.getDefault()).filter { it.isLetterOrDigit() }
    }
}