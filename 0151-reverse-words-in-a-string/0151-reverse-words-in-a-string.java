class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        char [] ch = s.toCharArray();
        int start = 0;
        int n = ch.length;
        for(int end = 0; end<n; end++){
            if(ch[end] == ' '){
                reverse(ch, start,end-1);
                start = end+1;
            }
        }
        reverse(ch,start,n-1);
        reverse(ch,0,n-1);
        String str1 = new String(ch);
        return str1;
    }
        public void reverse(char []ch, int low, int high){
            while(low<high){
                char temp = ch[low];
                ch[low] = ch[high];
                ch[high] = temp;
                low++;
                high--;
            }
        }
}