import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три","один","один","один"));
        Map<String, Integer> map = new HashMap<>();
        for (String word : words)
            if (map.containsKey(word)) {
                Integer count = map.get(word) + 1;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        System.out.println(map.values());
    }
}