package slidingWindow.bestTimeToBuyAndSellStock

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `maxProfit() should return profit`() {
        val input1 = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected1 = 5
        val result1 = solution.maxProfit(input1)
        assertEquals(expected1, result1)
    }

    @Test
    fun `maxProfit() should return zero profit`() {
        val input1 = intArrayOf(7, 6, 4, 3, 1)
        val expected1 = 0
        val result1 = solution.maxProfit(input1)
        assertEquals(expected1, result1)
    }
}