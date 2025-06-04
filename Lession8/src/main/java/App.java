import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        // Create new product
        Product product = new Product();
        product.setId(1223);
        // id = null
        Integer id = product.getId();
        System.out.println(id);
        // convert integer to string
        String idstr1 = String.valueOf(id);
        String idstr2 = id.toString();
        System.out.println(idstr1);
        System.out.println(idstr2);

        // Product{id=0, name='null', price=null, quantity=0, weight=0.0, amount=0.0}
        System.out.println(product);
    }

    // Data type
    private static class Product {
        // Integer là kiểu wrapper
        private Integer id;
        private String name;
        private BigDecimal price;
        private float quantity;
        private float weight;
        private double amount;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public float getQuantity() {
            return quantity;
        }

        public void setQuantity(float quantity) {
            this.quantity = quantity;
        }

        public float getWeight() {
            return weight;
        }

        public void setWeight(float weight) {
            this.weight = weight;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    ", weight=" + weight +
                    ", amount=" + amount +
                    '}';
        }
    }
}
