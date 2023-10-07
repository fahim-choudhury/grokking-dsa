package slidingWindow.repeatedDnaSequences

import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `findRepeatedDnaSequences() when string is equal or shorter than sequence returns an empty list`() {
        val input = "AAAAAAAAAA"
        val expected = emptyList<String>()
        val result = solution.findRepeatedDnaSequences(input)
        assert(expected == result)
    }

    @Test
    fun `findRepeatedDnaSequences() when no sequence is present returns an empty list`() {
        val input = "AAAAAAAAAAB"
        val expected = emptyList<String>()
        val result = solution.findRepeatedDnaSequences(input)
        assert(expected == result)
    }

    @Test
    fun `findRepeatedDnaSequences() when a sequence is present returns a single sequence`() {
        val input = "AAAAAAAAAAA"
        val expected = listOf("AAAAAAAAAA")
        val result = solution.findRepeatedDnaSequences(input)
        assert(expected == result)
    }

    @Test
    fun `findRepeatedDnaSequences() returns multiple sequences`() {
        val input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
        val expected = listOf("AAAAACCCCC", "CCCCCAAAAA")
        val result = solution.findRepeatedDnaSequences(input)
        assert(expected == result)
    }
}