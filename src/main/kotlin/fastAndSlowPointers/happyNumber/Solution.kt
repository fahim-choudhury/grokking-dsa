package fastAndSlowPointers.happyNumber

/**
 * LeetCode 202. Happy Number
 * https://leetcode.com/problems/happy-number/description/
 */
class Solution {
    fun isHappy(n: Int): Boolean {
        // Initialize slow and fast pointers with the input value
        var slow = n
        var fast = sumOfSquaredDigits(n)

        // Populate the initial set with the given number
        val squaredSum = mutableSetOf(slow)

        // If the initial squared sum is 1, n is a happy number
        if (fast == 1) return true

        // Check for a cycle
        while (fast !in squaredSum) {
            // Move the slow and fast pointers
            slow = fast
            fast = sumOfSquaredDigits(fast)

            // Add the current slow value to the set of squared sums
            squaredSum.add(slow)

            // If the fast pointer reaches 1, the number is happy
            if (fast == 1) return true
        }

        // If the loop exits without finding a cycle, n is not a happy number
        return false

    }

    // Helper function to calculate the sum of squared digits of an integer
    private fun sumOfSquaredDigits(value: Int): Int {
        var sum = 0
        var number = value

        // Extract digits, square them, and add to the sum
        while (number != 0) {
            val digit = number % 10
            number /= 10
            sum += digit * digit
        }
        return sum
    }
}