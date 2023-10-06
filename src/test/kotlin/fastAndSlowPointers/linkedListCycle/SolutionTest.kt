package fastAndSlowPointers.linkedListCycle

import dataStructures.linkedList.LinkedList
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun `hasCycle() returns false for empty linked list `() {
        val input = LinkedList<Int>()
        assertFalse(solution.hasCycle(input.head))
    }

    @Test
    fun `hasCycle() returns false for linked list with single element and without cycle`() {
        val input = LinkedList<Int>()
        input.run {
            push(4)
        }
        assertFalse(solution.hasCycle(input.head))
    }
}