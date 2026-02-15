class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int n=2*len;
        int ans[]=new int[n];
        for(int i=0;i<len;i++)
        {
            ans[i]=nums[i];
            ans[i+len]=nums[i];
        }
        return ans;
    }
}