import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        // Khởi tạo TreeSet
        TreeSet treeSet = new TreeSet<>();

        // Thêm phần tử vào TreeSet
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);

        // TreeSet tự động sắp xếp các phần tử
        System.out.println("TreeSet: " + treeSet); // [5, 10, 15, 20]

        // tailSet(E fromElement): Trả về một SortedSet chứa các phần tử lớn hơn hoặc bằng fromElement
        System.out.println(treeSet.tailSet(8)); // [10, 15, 20]
        System.out.println(treeSet.tailSet(15)); // [15, 20]
    }
}



