package twoPointers.sumOfThreeValues

/**
 * LeetCode: 15. 3Sum
 * https://leetcode.com/problems/3sum/description/
 */
class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        // Solution set must not contain duplicates, hence using Set data structure
        val result = mutableSetOf<List<Int>>()

        // Sort the array in ascending order
        nums.sort()

        nums.forEachIndexed { index, currentElement ->
            // Define left and right pointers
            var leftPointer = index + 1
            var rightPointer = nums.size - 1

            while (leftPointer < rightPointer) {
                val currentSum = currentElement + nums[leftPointer] + nums[rightPointer]

                // Check for the solution criteria
                if (currentSum == 0) {
                    val triplet = listOf(currentElement, nums[leftPointer], nums[rightPointer])
                    result.add(triplet)

                    // Even if find the triplet, it can be possible that there are other two values
                    // summed up to the current element that match up with the target, 0.
                    // We need to move the leftPointer towards the right by one step
                    leftPointer += 1
                }

                // Left pointer needs to move forward to match with bigger number
                if (currentSum < 0) {
                    leftPointer += 1
                }

                // Right pointer needs to move backward to match with lower number
                if (currentSum > 0) {
                    rightPointer -= 1
                }

            }

        }
        return result.toList()
    }
}