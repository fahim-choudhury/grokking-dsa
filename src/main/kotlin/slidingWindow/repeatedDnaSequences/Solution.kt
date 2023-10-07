package slidingWindow.repeatedDnaSequences

/**
 * LeetCode: 187. Repeated DNA Sequences
 * https://leetcode.com/problems/repeated-dna-sequences/description/
 */

class Solution {
    fun findRepeatedDnaSequences(s: String): List<String> {
        val sequenceLength = 10
        var start = 0
        var end = sequenceLength - 1

        val runningSetOfSequences = mutableSetOf<String>()
        val result = mutableSetOf<String>()

        if (s.length <= sequenceLength) return emptyList()

        while (end <= s.lastIndex) {
            val sequence = s.substring(start, end + 1)
            if (runningSetOfSequences.contains(sequence)) {
                result.add(sequence)
            } else {
                runningSetOfSequences.add(sequence)
            }
            start++
            end++
        }
        return result.toList()
    }
}