public class ThucThiTinhToan implements Tinhtoan {

    @Override
    public String printName() {
        return "Tinh toan da hinh";
    }

    @Override
    public float calculate(int a, int b) {
        return a + b;
    }
}
