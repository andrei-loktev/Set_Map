import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new HashSet<>(nums);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            }
        }
    }