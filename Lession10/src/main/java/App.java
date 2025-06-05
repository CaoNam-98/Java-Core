public class App {
    public static void main(String[] args) {
        String s1 = "Welcome to Tay Java";
        // char charAt(int index): Trả về giá trị char cho index cụ thể
        System.out.println("ChartAt: " + s1.charAt(11));

        // int length(): Trả về độ dài của string
        System.out.println("Length: " + s1.length());

        // format(String format, Object… args): Trả về một String đã được định dạng
        String name = "Messi";
        int age = 37;
        // Welcome Messi is 37 years old
        // Để %s cho bất kỳ kiểu dữ liệu gì cũng được kể cả số nguyên, chứ không nhất thiết %d
        String s2 = String.format("Welcome %s is %d years old", name, age);
        System.out.println("String.format: " + s2);

        // substring(int beginIndex): Trả về substring từ vị trí index cho trước
        // Trường hợp nếu muốn lấy từ vị trí 6 đến hết thì:
        String substring2 = s2.substring(5);
        System.out.println("substring(int beginIndex): " + substring2);

        // String substring(int beginIndex, int endIndex): Trả về substring từ index bắt đầu đến index kết thúc
        String substring = s2.substring(1, 5);
        System.out.println("substring(int beginIndex, int endIndex): " + substring);

        // boolean contains(CharSequence s): Nó trả về giá trị true hoặc false khi khớp với string giá trị char
        if (s2.contains("Messi")) {
            System.out.println("Hello, Messy");
        } else {
            System.out.println("Goodbye, Messy");
        }

        // static String join(CharSequence delimiter, CharSequence… elements): Trả về một string đã nối
        String s3 = String.join("-", "A", "B", "C", "D", "E", "F");
        System.out.println("String.join: " + s3);

        // boolean equals(Object another): Kiểm tra xem string có giống với đối tượng đã cho hay không và trả về boolean
        if (s1.equals("Welcome to Tay Java")) {
            System.out.println("Hello, Tay Java");
        } else {
            System.out.println("Goodbye, Tay Java");
        }

        // static String equalsIgnoreCase(String another): So sánh chuỗi nhưng không kiểm tra chữ hoa chữ thường
        String a = "Hello";
        String b = "hello";
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Giống nhau");
        } else {
            System.out.println("Khác nhau");
        }

        // boolean isEmpty(): Kiểm tra string có bị rỗng không và trả về boolean
        // String email = null mà kiểm tra email.isEmpty() thì báo ra lỗi
        String email = "";
        if (email.isEmpty()) {
            System.out.println("email is empty");
        } else {
            System.out.println("email is " + email);
        }

        // trim(): Loại bỏ khoảng trắng ở trước và sau String
        String email1 = "  a  ";
        if (email1.trim().isEmpty()) {
            System.out.println("email is empty");
        } else {
            System.out.println(email1);
        }

        // String concat(String str): Nối string đã chỉ định
        String s5 = s1.concat(s2);
        System.out.println("concat: " + s5);

        // replace(char old, char new): Thay thế tất cả các lần xuất hiện của giá trị char được chỉ định
        String s6 = s5.replace("37", "18");
        System.out.println("replace: " + s6);

        // 	String[] split(String regex): Trả về một string phân tách khớp với regex là dấu " "
        String[] split = s6.split(" ");
        System.out.println("split: " + split);
        for(String s: split) {
            System.out.println(s);
        }

        // String intern(): Trả về một string đã được đồng bộ trong String constant pool
        // nó sẽ tham chiếu giá trị từ s1 sang intern
        String intern = s1.intern();
        System.out.println("intern " + intern);

        // int indexOf(int ch): Trả về vị trí index của string mà mình truyền vào
        System.out.println(intern.indexOf("t"));

        // String toLowerCase(): Trả về một string thường
        System.out.println("toLowerCase: " + intern.toLowerCase());

        // String toUpperCase(): Trả về một STRING IN HOA
        System.out.println("toUpperCase: " + intern.toUpperCase());

        // static String valueOf(int value): Chuyển đổi kiểu từ dữ liệu đã cho thành string. Đây là overloading method
        float pi = 3.1415926f;
        String s8 = String.valueOf(pi);

        // StringBuilder là một loại string nhưng nó cho phép kích thước động
        // Chạy bất đồng bộ: non-synchronize
        StringBuilder builder = new StringBuilder("Hello");
        // append: Thêm ký tự vào phía sau
        builder.append(", ");
        builder.append("Tay");
        System.out.println("StringBuilder: " + builder);

        // chạy đồng bộ trên synchronize
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(", ");
        sb.append("Tay");
        System.out.println("StringBuffer: " + sb);
    }
}
