class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int size = 2*nums.length;
        int[] ans = new int[size];

        for(int i = 0 ; i<nums.length ; i++){
            ans[i] = nums[i];
        }
        for(int i = nums.length ; i< size ;i++){
                ans[i] = nums[i-nums.length]; 
        }

        return ans;
    }
}