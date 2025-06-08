import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Thêm phần tử vào cuối
        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");
        deque.addLast("D");
        deque.addLast("E");

        deque.push("Test push1");
        deque.push("Test push2");
        deque.push("Test push3");
        System.out.println(deque); // [Test push3, Test push2, Test push1, A, B, C, D, E]

        System.out.println(deque.pop()); // Test push3
        System.out.println(deque); // [Test push2, Test push1, A, B, C, D, E]
    }
}



