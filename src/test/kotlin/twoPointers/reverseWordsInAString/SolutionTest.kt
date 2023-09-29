package twoPointers.reverseWordsInAString

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

// Test cases are generated using Phind AI model.
class SolutionTest {

    private val solution = Solution()

    @Test
    fun `test with string having single word`() {
        val input = "Hello"
        val expected = "Hello"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }

    @Test
    fun `test with string having multiple words`() {
        val input = "Hello World"
        val expected = "World Hello"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }

    @Test
    fun `test with string having leading spaces`() {
        val input = "   Hello World"
        val expected = "World Hello"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }

    @Test
    fun `test with string having trailing spaces`() {
        val input = "Hello World   "
        val expected = "World Hello"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }

    @Test
    fun `test with string having multiple words and spaces`() {
        val input = "Hello World   How Are You"
        val expected = "You Are How World Hello"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }

    @Test
    fun `test with string having multiple words and extra spaces`() {
        val input = "Hello   World    How   Are   You"
        val expected = "You Are How World Hello"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }

    @Test
    fun `test with string having no words`() {
        val input = "    "
        val expected = ""
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }

    @Test
    fun `test with string having single space`() {
        val input = " "
        val expected = ""
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }
}
