package twoPointers.sumOfThreeValues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    private val sut = Solution()

    @Test
    fun `threeSum() should return a list of triplets`() {
        val input1 = intArrayOf(-1, 0, 1, 2, -1, -4)
        val input2 = intArrayOf(0, 0, 0)

        val expected1 = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
        val expected2 = listOf(listOf(0, 0, 0))

        assertEquals(expected1, sut.threeSum(input1))
        assertEquals(expected2, sut.threeSum(input2))
    }
}