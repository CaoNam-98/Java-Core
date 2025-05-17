import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Condition if...else
        System.out.println("If...else condition");

        int age = 64;
        if (age < 60) {
            System.out.println("60 là tuổi thiếu nhi");
        } else if (age >= 60 && age < 65) { // condition
            // printf in xong nhưng không xuống dòng, muốn xuống dòng phải thêm \n
            System.out.printf("%d là tuổi mới đi vào đời\n", age);
            // println in xong thì sẽ tự động xuống dòng
            System.out.println(age + " là tuổi mới đi vào đời");
        } else if (age >= 65 && age < 70) {
            System.out.println("70 là tuổi ăn chơi");
        } else {
            System.out.println("70 là tuổi yêu đời, yêu hoa");
        }

        // Condition switch...case
        System.out.println("Switch...case condition");
        String expression = "874";
        switch(expression) {
            case "123":
                System.out.println("Bạn đã nhận được khoản tiền thưởng 100k");
                break;
            case "874":
                System.out.println("Bạn đã nhận được khoản tiền thưởng 200k");
                break;
            case "692":
                System.out.println("Bạn đã nhận được khoản tiền thưởng 500k");
                break;
            default:
                System.out.println("Chúc bạn lần sau may mắn");
        }

        // Lệnh switch...case bên trên tương ứng như sau
        if (expression.equals("123")) {
            System.out.println("Bạn đã nhận được khoản tiền thưởng 100k");
        } else if (expression.equals("874")) {
            System.out.println("Bạn đã nhận được khoản tiền thưởng 200k");
        } else if (expression.equals("692")) {
            System.out.println("Bạn đã nhận được khoản tiền thưởng 500k");
        } else {
            System.out.println("Chúc bạn lần sau may mắn");
        }

        // Condition For
        for (int i = 1; i <= 10; i++) { // i++ = i + 1
            System.out.println("So: " + i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("So: " + i);
        }

        // Lặp chồng lặp (++)
        for (int i = 1 ; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lặp chồng lặp (--)
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // foreach: đọc một danh sách với các kiểu dữ liệu khác nhau để tìm ra giá trị tương ứng
        System.out.println("forEach condition");
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("H");

        // for (data_type variable: array_name
        for (String s: list) {
            if (s.equals("B")) {
                System.out.println(s);
            }
        }

        // While
        System.out.println("While condition");
        int x = 5;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        // do...while
        System.out.println("Do...while condition");
        int y = 5;
        do {
            System.out.println(y);
            y++;
        } while (y <= 10);

        // Break: câu lệnh ngắt quãng
        System.out.println("Break statement");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // ngắt vòng lặp tại đây
            }
            System.out.println("So: " + i);
        }

        // Continue: Bỏ qua lần lặp đó và nhảy qua lần lặp tiếp theo
        System.out.println("Continue statement");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // tiếp tục vòng lặp tiếp theo
            }
            System.out.println("So: " + i);
        }

        // Java comment
        // Chú thích dòng đơn: //
        // Chú thích nhiều dòng: /* ... */
        /*
            Chú thích n dòng
            In ra giá trị từ 0 - 9
            Khởi tạo i = 0
            kết thúc i < 10
         */
        // Chú thích kiểu Javadoc: /** ... */
    }

    /**
     * In ra tên
     * @param name
     * @return string
     */
    public static String printMessage(String name) {
        System.out.println(name);
        return "Xin chào, " + name;
    }
}
