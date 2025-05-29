import java.util.List;

public class Person {
    // 1. field là thể hiện của state
    private Long id; // identity
    private String firstName; // field
    private String lastName; // field
    private List<Address> address;

    // 2. Behavior

    // Constructor: nếu không khởi tạo thì java sẽ tự tạo ra hàm này
    public Person() {}

    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // phục vụ cho lệnh System.out.println(person1); bên app thay vì thấy Person@4abdb505
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    // Đối tượng lồng
    // có static để phía bên App có thể truy cập được new Person.Address();
    static class Address {
        private String street;
        private String city;
        private String state;
        private String zip;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        // phục vụ cho lệnh System.out.println(person1); bên app thay vì thấy Person$Address@4617c264, Person$Address@36baf30c
        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zip='" + zip + '\'' +
                    '}';
        }
    }
}
