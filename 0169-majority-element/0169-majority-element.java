class Solution {
    public int majorityElement(int[] nums) 
    {
        return max_freq(nums,nums[0],0);
    }
    public int max_freq(int[] arr, int val, int index)
    {
        int count = 0;
        for(int i = index;i<arr.length;i++){
            if(arr[i]==val)
                count++;
            else
                count--;
            if(count<0)
                return max_freq(arr,arr[i],i);
        }
        return val;
    }
}