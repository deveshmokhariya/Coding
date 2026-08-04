class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int begin = 0;
        int end = s.length()-1;
        while(begin<end){
            if(s.charAt(begin) != s.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}