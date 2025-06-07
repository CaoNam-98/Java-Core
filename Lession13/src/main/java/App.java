import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Thêm phần tử
        list.add("Cam");
        list.add("Quýt");
        list.addFirst("Mít");
        list.addLast("Dừa");
        System.out.println("List: " + list); // Result: [Mít, Cam, Quýt, Dừa]
        list.remove(2);
        System.out.println("List remove: " + list); // Result: [Mít, Cam, Dừa]
    }
}



