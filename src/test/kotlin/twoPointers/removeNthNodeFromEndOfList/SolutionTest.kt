package twoPointers.removeNthNodeFromEndOfList

import dataStructures.linkedList.LinkedList
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    // SUT: System Under Test
    private val solution = Solution()

    @Test
    fun `removeNthFromEnd() should remove nth value from end of list`() {
        val input = LinkedList<Int>()
        input.apply {
            push(5)
            push(4)
            push(3)
            push(2)
            push(1)
        }
        val n = 2
        val head = solution.removeNthNodeFromEnd(input.head, n)
        val expected = LinkedList<Int>().apply {
            push(5)
            push(3)
            push(2)
            push(1)
        }
        assertEquals(expected.head.toString(), head.toString())
    }

    @Test
    fun `removeNthFromEnd() should remove the first value from the list`() {
        val input = LinkedList<Int>()
        input.apply {
            push(5)
            push(4)
            push(3)
            push(2)
            push(1)
        }
        val n = 5
        val head = solution.removeNthNodeFromEnd(input.head, n)
        val expected = LinkedList<Int>().apply {
            push(5)
            push(4)
            push(3)
            push(2)
        }
        assertEquals(expected.head.toString(), head.toString())
    }

    @Test
    fun `removeNthFromEnd() should remove nth value from end of list with only one value`() {
        val input = LinkedList<Int>().apply {
            push(1)
        }
        val expected = LinkedList<Int>()
        val head = solution.removeNthNodeFromEnd(input.head, 1)
        assertEquals(expected.head.toString(), head.toString())
    }

    @Test
    fun `removeNthFromEnd() should return null on empty list`() {
        val input = LinkedList<Int>()
        val expected = LinkedList<Int>()
        val head = solution.removeNthNodeFromEnd(input.head, 1)
        assertEquals(expected.head.toString(), head.toString())
    }
}