class Solution {
    public boolean isPalindrome(String s) {
      String a = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      int i = 0;
      int j = a.length() - 1;
      while(i<j){
        if(a.charAt(i) != a.charAt(j)){
            return false;
        }
        i++;
        j--;
      }  
      return true;
    }
}