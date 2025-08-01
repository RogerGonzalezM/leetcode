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
*  - Each input has excatly one solution.                     *
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

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target)
    {
        for (int i = 0; i < nums.size() - 1; i++)
        {
            for (int j = 1; j < nums.size(); j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return { i, j };
                }
            }
        }
        return {};
    }
};

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target)
    {
        unordered_map<int, int> hashMap;
        for (int i = 0; i < nums.size(); i++)
        {
            hashMap[nums[i]] = i;
        }

        for (int i = 0; i < nums.size(); i++)
        {
            int aux = target - nums[i];
            if (hashMap.count(aux) && hashMap[aux] != i)
                return { i, hashMap[aux] };
        }
        return {};
    }
};

