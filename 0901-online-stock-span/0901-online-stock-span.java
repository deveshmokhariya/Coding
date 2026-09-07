import java.util.*;

class StockSpanner {

    ArrayList<Integer> stocks;
    Stack<Integer> s;

    public StockSpanner() {
        stocks = new ArrayList<>();
        s = new Stack<>();
    }

    public int next(int price) {

        stocks.add(price);

        int i = stocks.size() - 1;

        while (!s.isEmpty() && price >= stocks.get(s.peek())) {
            s.pop();
        }

        int span;

        if (s.isEmpty()) {
            span = i + 1;
        } else {
            int prevHigh = s.peek();
            span = i - prevHigh;
        }

        s.push(i);

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */