
Problem : Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it can trap after raining. 

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1] 
Output: 6 
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.

Example 2: 
Input: height = [4,2,0,3,2,5] 
Output: 9

Solution : 

Observation : To know at any elevation, how much water it can trap we need find the minimum of left maximum elevation and 
  right maximum elevation. then subtracting current elevation height.
  solution will be sum of the water that can be trapped at each elevation.
  Through this observation brute force approach comes into picture. => O(n^2)

  Edge cases : what will be the leftMax of first elevation and rightMax of last elevation ? 
  It itself will be the maximum.

Observation 2 : No water will be trapped at first and last elevation.

Improvement : Instead of calculating leftMax and right at each iteration, precompute it 