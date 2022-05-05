package HackerRank;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RansomNote {
    public static void main(String[] args) {

    }

    public static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Long> magazineMap = Arrays.stream(magazine).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        Map<String, Long> noteMap = Arrays.stream(note).collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        boolean allContain = noteMap.keySet().stream().allMatch(magazineMap::containsKey) &&
                             noteMap.keySet().stream().allMatch(key -> magazineMap.get(key) >= noteMap.get(key));

        System.out.println(allContain ? "Yes" : "No");
    }
}
