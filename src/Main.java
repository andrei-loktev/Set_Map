import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>(Arrays.asList("zaq", "xsw", "cde", "zaq", "xsw", "bgt", "xsw"));
        Set<String> set = new HashSet<>(word);
        System.out.println(set);
    }
}