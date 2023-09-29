package twoPointers.reverseWordsInAString

/**
 * LeetCode 151. Revers Words in a String
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
class Solution {
    fun reverseWords(s: String): String {
        val loopCount = s.length - 1
        var start = 0
        var end: Int
        var result = ""

        while (start <= loopCount) {
            // Skip leading spaces
            while (start <= loopCount && s[start] == ' ') {
                start++
            }

            // Break if no more characters
            if (start > loopCount) break

            // Find the end of the word
            end = start + 1
            while (end <= loopCount && s[end] != ' ') {
                end++
            }

            // Extract the current word
            val word = s.substring(start, end)

            // If result is empty, set result to word, otherwise add word to the beginning of result
            result = if (result.isEmpty()) {
                word
            } else {
                "$word $result"
            }

            // Move to the start of the next word
            start = end + 1

        }
        return result
    }
}