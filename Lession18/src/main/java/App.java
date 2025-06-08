import java.util.Date;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        // Tạo một HashMap
        HashMap<String, Object> map = new HashMap<>();

        // Thêm các phần tử vào HashMap
        map.put("timestamp", new Date());
        map.put("status", 400);
        map.put("path", "/api/v1/users");
        map.put("error", "invalid_request");
        map.put("message", "username or password is incorrect");
        map.put("1", null);

        if (map.containsValue("invalid_request")) {
            System.out.println("Request body is invalid");
        }
    }
}



