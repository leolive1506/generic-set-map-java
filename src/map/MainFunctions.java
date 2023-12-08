package map;

import java.util.Map;
import java.util.TreeMap;

public class MainFunctions {
    public static void main() {
    Map<String, String> cookies = new TreeMap<>();
    cookies.put("user.username", "Maria");
    cookies.put("user.email", "maria@gmail.com");
    cookies.put("user.phone", "9971112");

    cookies.remove("user.email");
    cookies.put("user.phone", "3498416-8590");

    System.out.println("Contains 'phone' key: " + cookies.containsKey("user.phone"));
    System.out.println("'Email' key deleted: " + cookies.get("user.email"));

    System.out.println("ALL COOKIES: " + cookies.size());
    for (String key: cookies.keySet()) {
      System.out.println(key + ": " + cookies.get(key));
    }
  }
}
