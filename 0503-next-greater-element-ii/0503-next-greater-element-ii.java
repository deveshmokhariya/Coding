class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[nums.length];
        for(int i = 2 * nums.length - 1; i >= 0; i--) {
            int index = i % nums.length;
            while(!s.isEmpty() && nums[s.peek()] <= nums[index]) {
                s.pop();
            }
            if(i < nums.length) {
                if(s.isEmpty()) {
                    nextGreater[index] = -1;
                } else {
                    nextGreater[index] = nums[s.peek()];
                }
            }
            s.push(index);
        }
        return nextGreater;
    }
}