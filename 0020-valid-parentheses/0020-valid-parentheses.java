class Solution {
    public boolean isValid(String s) {
        Stack<Character> ll= new Stack<>();
        for(int i = 0 ;i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                ll.push(ch);
            }
            else{
                if(ll.isEmpty()){
                    return false;
                }
                if((ll.peek() == '(' && ch == ')') 
                || (ll.peek() == '{' && ch == '}')
                || (ll.peek() == '[' && ch == ']')){
                    ll.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(ll.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}