class Solution {
    public int firstMissingPositive(int[] nums) {
        int l = nums.length;
        int []  present = new int[l];
        for(int i=0; i<l; i++){
            if(nums[i]>0&&nums[i]<=l){
                present[nums[i]-1]=1;
            }
        }
        for(int i=0; i<l; i++){
            if(present[i]!=1){
                return i+1;
            }
        }
        return l+1;
    }
}
