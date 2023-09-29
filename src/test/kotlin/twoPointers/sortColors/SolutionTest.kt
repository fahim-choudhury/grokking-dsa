package twoPointers.sortColors

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("inputArrays")
    fun sortColors(inputArray: IntArray) {
        val expected = inputArray.sortedArray()

        solution.sortColors(inputArray)

        assertEquals(true, inputArray.contentEquals(expected))
    }

    companion object {
        @JvmStatic
        private fun inputArrays(): List<IntArray> {
            return listOf(intArrayOf(2, 0, 2, 1, 1, 0), intArrayOf(0, 1, 2))
        }
    }
}