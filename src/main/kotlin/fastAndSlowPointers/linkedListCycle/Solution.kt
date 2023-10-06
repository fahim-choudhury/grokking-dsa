package fastAndSlowPointers.linkedListCycle

import dataStructures.linkedList.Node

/**
 * LeetCode 141. Linked List Cycle
 *https://leetcode.com/problems/linked-list-cycle/description/
 */
class Solution {
    fun hasCycle(head: Node<Int>?): Boolean {
        var slowPointer = head
        var fastPointer = head

        while (fastPointer != null && fastPointer.next?.next != null) {
            fastPointer = fastPointer.next?.next
            slowPointer = slowPointer?.next
            if (fastPointer === slowPointer) return true
        }
        return false
    }
}