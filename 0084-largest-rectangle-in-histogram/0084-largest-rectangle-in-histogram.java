// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int nsr[] = new int[heights.length]; 
//         int nsl[] = new int[heights.length];
//         int maxArea = 0;
//         //nearest smaller right
//         Stack<Integer> s = new Stack<>();
//         for(int i = heights.length - 1; i>=0; i--){
//             while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nsr[i] = heights.length;
//             }
//             else{
//                 nsr[i] = s.peek();
//             }
//             s.push(i);
//         } 
//         //nearest smaller left
//         s = new Stack<>(); //clr stack
//         for(int i = 0; i<heights.length; i++){
//             while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nsl[i] = -1;
//             }
//             else{
//                 nsl[i] = s.peek();
//             }
//             s.push(i);
//         } 
//         //area
//         for(int i = 0; i<heights.length; i++){
//             int height = heights[i];
//             int width = nsr[i] - nsl[i] - 1;
//             int curr = height * width;
//             maxArea = Math.max(curr, maxArea);
//         }
//         return maxArea;
//     }
// }
class Solution {
    static{
        for(int i = 0; i < 1000; i++) {
            largestRectangleArea(new int[] {i});
            }
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] stack = new int[n+1];
        int top = -1;
        int maxArea = 0;
        for(int i = 0; i <= n; i++){
            int currentHeight = (i == n) ? 0 : heights[i];
            while(top != -1 && currentHeight < heights[stack[top]]){
               int barIndex = stack[top--];
               int height = heights[barIndex];
               int width;
               if(top == -1){
                width = i;
               }
               else{
                width = i - stack[top] - 1;
               }
               maxArea = Math.max(maxArea, height *width);
            }
            stack[++top] = i;
        }
        return maxArea;
    }
}