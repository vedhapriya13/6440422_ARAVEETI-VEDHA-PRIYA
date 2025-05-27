import org.json.JSONObject;

public class JSONExample {
    public static void main(String[] args) {
        // Creating a JSON object
        String jsonString = "{\"name\":\"Alice\",\"age\":25}";
        JSONObject jsonObject = new JSONObject(jsonString);

        // Extracting data
        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}