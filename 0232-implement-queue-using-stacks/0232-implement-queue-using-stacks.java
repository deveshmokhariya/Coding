// class MyQueue {
//     Stack<Integer> s1 = new Stack<>();
//     Stack<Integer> s2 = new Stack<>();

//     public MyQueue() {
        
//     }
    
//     public void push(int x) {
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());
//         }
//         s1.push(x);
//         while(!s2.isEmpty()){
//             s1.push(s2.pop());
//         }
//     }
    
//     public int pop() {
//         if(s1.isEmpty()){
//             return -1;
//         }
//         return s1.pop();
//     }
    
//     public int peek() {
//         if(s1.isEmpty()){
//             return -1;
//         }
//         return s1.peek();
//     }
    
//     public boolean empty() {
//         return s1.isEmpty();
//     }
// }

// /**
//  * Your MyQueue object will be instantiated and called as such:
//  * MyQueue obj = new MyQueue();
//  * obj.push(x);
//  * int param_2 = obj.pop();
//  * int param_3 = obj.peek();
//  * boolean param_4 = obj.empty();
//  */

class MyQueue {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }
}