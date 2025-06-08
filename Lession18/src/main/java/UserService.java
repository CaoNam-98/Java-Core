public class UserService implements SampleInterface, EmployeeInterface {
    // Chỉ có thể lấy ra các abstract method
    @Override
    public void getName() {
        System.out.println(name);
    }

    public void getBirthday() {}

    @Override
    public void sayHello() {

    }
}
