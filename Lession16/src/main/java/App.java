import java.util.Comparator;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        // Hàng đợi ưu tiên với thứ tự giảm dần
        PriorityQueue pq = new PriorityQueue<>(Comparator.reverseOrder());

        // Thêm phần tử
        pq.add(15);
        pq.add(20);
        pq.add(10);

        System.out.println("PriorityQueue ban đầu: " + pq); // [20, 15, 10]

        // Lấy phần tử có độ ưu tiên cao nhất (lớn nhất trong trường hợp này)
        System.out.println("Phần tử ưu tiên cao nhất: " + pq.peek()); // 20
    }
}



