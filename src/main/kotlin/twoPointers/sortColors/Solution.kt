package twoPointers.sortColors

/**
 * LeetCode: 75. Sort Colors
 * https://leetcode.com/problems/sort-colors/description/
 *
 * Solution explanation:
 * https://youtu.be/6sMssUHgaBs?si=1BWArF_J0UVbUpka
 * https://youtu.be/sEQk8xgjx64?si=UqAuee0F5FOlFr9w
 */

class Solution {
    fun sortColors(nums: IntArray) {
        // Take three pointers
        var start = 0
        var middle = 0
        var end = nums.size - 1

        // Iterate until the middle pointer crosses the end pointer
        while (middle <= end) {
            // Middle has Start's value, so need to swap
            // As the starting chunk is set, we move forward start and middle one step
            if (nums[middle] == 0) {
                swap(nums, middle, start)
                start++
                middle++
            } else if (nums[middle] == 1) {
                // Middle is at its natural position, just move forward one step
                middle++
            } else if (nums[middle] == 2) {
                // Middle has End's value, so need to swap
                // Ending chunk is set, so we move end one step backward
                swap(nums, middle, end)
                end--
            }
        }

    }

    private fun swap(nums: IntArray, position1: Int, position2: Int) {
        val temp = nums[position1]
        nums[position1] = nums[position2]
        nums[position2] = temp
    }
}

