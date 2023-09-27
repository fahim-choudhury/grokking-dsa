package twoPointers.validPalindrome

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    private val sut = Solution()

    @ParameterizedTest
    @MethodSource("validPalindromeData")
    fun `isPalindrome() returns true for valid palindromes`(input: String) {
        assertEquals(true, sut.isPalindrome(input))
    }

    @ParameterizedTest
    @MethodSource("invalidPalindromeData")
    fun `isPalindrome() returns false for invalid palindromes`(input: String) {
        assertEquals(false, sut.isPalindrome(input))
    }

    companion object {
        @JvmStatic
        private fun validPalindromeData(): List<String> {
            return listOf("A man, a plan, a canal: Panama", " ")
        }

        @JvmStatic
        fun invalidPalindromeData(): List<String> {
            return listOf("race a car")
        }
    }
}