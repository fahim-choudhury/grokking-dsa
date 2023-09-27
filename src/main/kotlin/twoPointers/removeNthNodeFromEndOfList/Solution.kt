package twoPointers.removeNthNodeFromEndOfList

import dataStructures.linkedList.Node

/**
 * LeetCode: 19. Remove Nth Node From End of List
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 */

class Solution {
    fun <T : Any> removeNthNodeFromEnd(head: Node<T>?, n: Int): Node<T>? {
        // Two pointers, left and right are set at the head node
        var leftPointer = head
        var rightPointer = head

        // Move the right pointer n steps forward
        repeat(n) {
            rightPointer = rightPointer?.next
        }

        // If right reaches null, then n is the size of the list
        // We need to return the immediate next node after head
        if (rightPointer == null) {
            return head?.next
        }

        // Move both left and right pointers forward until right reaches the last node
        while (rightPointer?.next != null) {
            rightPointer = rightPointer?.next
            leftPointer = leftPointer?.next
        }

        // Relink the left node to the node at left's next to the next node
        leftPointer?.next = leftPointer?.next?.next

        return head
    }

}