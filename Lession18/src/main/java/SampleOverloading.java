public class SampleOverloading {
    // Thay đổi số lượng arguments
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Thay đổi kiểu dữ liệu
    public float add(float a, float b) {
        return a + b;
    }

    public float add(float a, float b, float c) {
        return a + b + c;
    }

    private String print() {
        return "Hello World";
    }

    private String print(String name) {
        return "Hello World, " + name;
    }

    private String print(float name) {
        return "Hello World, " + name;
    }
}
