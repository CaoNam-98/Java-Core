import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class App {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Thêm các phần tử vào HashMap
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");

        System.out.println(map); // {1=A, 2=B, 3=C, 4=D, 5=E}

        for (Integer key: map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}



