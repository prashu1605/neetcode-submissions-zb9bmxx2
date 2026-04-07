class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 0;
        int ans = 0;

        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i] == nums[j]){
                    count ++;
                }
            } if(count < (nums.length / 2)){
                count = 0;
            } else {
                ans = nums[i];
                break;
            }
        }

        return ans;
    }
}