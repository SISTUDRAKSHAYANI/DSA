/*
 * LeetCode 704 - Binary Search
 *
 * Problem:
 * Given a sorted array of integers and a target value,
 * return the index of the target if it exists.
 * Otherwise, return -1.
 *
 * Approach:
 * - Apply Binary Search on the sorted array.
 * - Compare the middle element with the target.
 * - If target is smaller, search the left half.
 * - If target is larger, search the right half.
 * - Continue until the target is found or the search space becomes empty.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Topic: Binary Search
 */
class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
               return mid;
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}
