import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setId(1l);
        person1.setFirstName("John");
        person1.setLastName("Doe");
        List<Person.Address> addresses = new ArrayList<Person.Address>();
        Person.Address address1 = new Person.Address();
        address1.setCity("Ha Noi");
        address1.setState("hanoi");
        address1.setStreet("Pham Van Dong");
        addresses.add(address1);

        Person.Address address2 = new Person.Address();
        address2.setCity("Sai Gon");
        address2.setState("Saigon");
        address2.setStreet("Pham Van Dong");
        addresses.add(address2);

        person1.setAddress(addresses);

        System.out.println(person1.getFirstName());


        Person person2 = new Person(2l, "Tay", "Java");

        System.out.println(person1);
        System.out.println("============");
        System.out.println(person2);
    }
}
