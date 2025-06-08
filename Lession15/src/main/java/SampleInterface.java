import java.time.LocalDate;

// default is public if you write or not
public interface SampleInterface {
    // declare constant fields
    String name = "Tay Java";

    // declare methods that abstract: một phương thức không có body
    void getName();
    void getBirthday();

    // default method (non-abstract method)
    default void printName() {
        System.out.println(name);
    }

    // static method
    static String getCurrentTime() {
        return String.valueOf(LocalDate.now());
    }
}

//@FunctionalInterface
//public interface SampleInterface {
//    // SAM = SINGLE ABSTRACT METHOD: nếu ta thêm @FunctionalInterface thì chỉ duy nhất một function bên trong
//    int sum(int a, int b);
//}
