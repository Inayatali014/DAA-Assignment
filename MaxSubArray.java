class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            currentSum += nums[i];
            maxSum = currentSum > maxSum ? currentSum : maxSum;
            currentSum = currentSum < 0 ? 0 : currentSum;
        }
        return maxSum;
    }
}
