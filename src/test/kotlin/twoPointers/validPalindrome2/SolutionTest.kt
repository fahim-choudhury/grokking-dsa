package twoPointers.validPalindrome2

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun testEmptyString() {
        val solution = Solution()
        assertTrue(solution.validPalindrome(""))
    }

    @Test
    fun testSingleCharacter() {
        val solution = Solution()
        assertTrue(solution.validPalindrome("a"))
    }

    @Test
    fun testTwoDifferentCharacters() {
        val solution = Solution()
        assertTrue(solution.validPalindrome("ab"))
    }

    @Test
    fun testTwoIdenticalCharacters() {
        val solution = Solution()
        assertTrue(solution.validPalindrome("aa"))
    }

    @Test
    fun testThreeCharactersOddLength() {
        val solution = Solution()
        assertTrue(solution.validPalindrome("aba"))
    }

    @Test
    fun testThreeCharactersOddLengthNotPalindrome() {
        val solution = Solution()
        assertFalse(solution.validPalindrome("abc"))
    }

    @Test
    fun testFourCharactersEvenLength() {
        val solution = Solution()
        assertTrue(solution.validPalindrome("abba"))
    }

    @Test
    fun testFourCharactersEvenLengthNotPalindrome() {
        val solution = Solution()
        assertFalse(solution.validPalindrome("abcd"))
    }

    @Test
    fun testLargeInputPerformance() {
        val solution = Solution()
        val largeInput = "a".repeat(1_000_000)
        assertTrue(solution.validPalindrome(largeInput))
    }
}
