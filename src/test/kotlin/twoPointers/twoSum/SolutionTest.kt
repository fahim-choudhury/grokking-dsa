package twoPointers.twoSum

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun `test twoSum() with same value`() {
        val solution = Solution()

        val input = intArrayOf(3, 3)
        val target = 6
        val expected = intArrayOf(0, 1)

        val result = solution.twoSum(input, target)
        assertTrue(expected contentEquals result)
    }

    @Test
    fun `test twoSum() with repeating values`() {
        val solution = Solution()

        val input = intArrayOf(2, 3, 3)
        val target = 6
        val expected = intArrayOf(1, 2)

        val result = solution.twoSum(input, target)
        assertTrue(expected contentEquals result)
    }

    @Test
    fun `test twoSum() with multiple values`() {
        val solution = Solution()

        val input = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(0, 1)

        val result = solution.twoSum(input, target)
        assertTrue(expected contentEquals result)
    }
}