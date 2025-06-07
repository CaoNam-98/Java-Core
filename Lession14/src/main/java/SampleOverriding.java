public class SampleOverriding extends SampleAbstractClass implements SampleInterface {
    @Override
    public void sayHello() {

    }

    @Override
    public void getName() {

    }

    @Override
    public void getBirthday() {

    }

    @Override
    public void printName() {
        SampleInterface.super.printName();
    }
}
