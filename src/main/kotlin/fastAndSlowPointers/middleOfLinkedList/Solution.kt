package fastAndSlowPointers.middleOfLinkedList

import dataStructures.linkedList.Node

/**
 * LeetCode: 876. Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/description/
 */
class Solution {
    fun middleNode(head: Node<Int>?): Node<Int>? {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }
        return slow
    }
}