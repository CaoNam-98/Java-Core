public abstract class SampleAbstractClass2 {
    // constructor
    public SampleAbstractClass2() {
    }

    // abstract method
    public abstract void sayHello(); // abstract method has not body

    // no abstract method has body
    public int calculate(int a, int b) {
        return a + b;
    }

    // static method
    public static void sayGoodBye() {
        System.out.println("Bye!");
    }

    // final method
    public final void noChangeBody(){
        System.out.println("Lớp con không được thay đổi nội dung của phương thức này vì nó là final method");
    }
}
