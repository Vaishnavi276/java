import java.util.*;
public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "programming";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : s.toCharArray())
            if (ch != ' ')
                map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch : map.keySet())
            System.out.println(ch + " = " + map.get(ch));
    }
}