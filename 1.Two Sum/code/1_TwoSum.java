// Source: https://leetcode.com/problems/two-sum/description/
// Author: Roger Gonzalez Monleon

/*
***************************************************************
*                         TWO SUM PROBLEM                     *
***************************************************************
*                                                             *
*  Given an array of integers nums and an integer target,     *
*  return the indices of the two numbers such that they       *
*  add up to target                                           *
*                                                             *
*  Constraints:                                               *
*  - Each input has exactly one solution.                     *
*  - You may not use the same element twice.                  *
*  - You can return the answer in any order.                  *
*                                                             *
* ---------------------- EXAMPLES --------------------------- *
* Example 1:                                                  *
* Input:  nums = [2,7,11,15], target = 9                      *
* Output: [0,1]                                               *
* Explanation: nums[0] + nums[1] == 9                         *
*                                                             *
* Example 2:                                                  *
* Input:  nums = [3,2,4], target = 6                          *
* Output: [1,2]                                               *
*                                                             *
* Example 3:                                                  *
* Input:  nums = [3,3], target = 6                            *
* Output: [0,1]                                               *
*                                                             *
* --------------------- CONSTRAINTS ------------------------- *
* - 2 <= nums.length <= 10^4                                  *
* - -10^9 <= nums[i] <= 10^9                                  *
* - -10^9 <= target <= 10^9                                   *
* - Only one valid answer exists.                             *
*                                                             *
* -------------------- SOLUTION I  -------------------------- *
*  Time Complexity: O(n^2)                                    *
*  Space Complexity: O(1)                                     *
*                                                             *
* -------------------- SOLUTION II  ------------------------- *
*  Time Complexity: O(n)                                      *
*  Space Complexity: O(n)                                     *
*                                                             *
***************************************************************
*/

// ------------------ SOLUTION I: Brute Force ------------------

public int[] twoSumBruteForce(int[] nums, int target) 
{
    for (int i = 0; i < nums.length - 1; i++) 
    {
        for (int j = 1; j < nums.length; j++) 
        {
            if (nums[i] + nums[j] == target && i != j) 
            {
                return new int[] { i, j };
            }
        }
    }
    return new int[] {};
}

// ------------------ SOLUTION II: Optimized --------------------

public int[] twoSumOptimized(int[] nums, int target) 
{
    Map<Integer, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) 
    {
        hashMap.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) 
    {
        int aux = target - nums[i];
        if (hashMap.containsKey(aux) && hashMap.get(aux) != i) 
        {
            return new int[] { i, hashMap.get(aux) };
        }
    }

    return new int[] {};
}
