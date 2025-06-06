import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A"); // index = 0
        list.add("B"); // index = 1
        list.add("C"); // index = 2
        list.add("D"); // index = 3
        list.add("E"); // index = 4
        // subList: trả về một mảng arrayList bị cắt
        List<String> list1 = list.subList(2, 4); // Lấy ra phần tử tại vị trí 2, 3
        System.out.println(list1);
    }
}
