class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
      int n= nums.length;
       for(int i =0; i<n; i++){
        for(int j= i+1; j<n; j++){
            int sum = nums[i]+nums[j];
            if(sum == target){
                 ans[0] = i;
                 ans[1] = j;
                break;
               
            }
        }
       }
        return ans;
        
    }
}