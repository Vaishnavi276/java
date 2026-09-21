import java.util.HashMap;
public class MostRepeatedCharacter {
    public static void main(String[] args) {
        String str = "Hello world";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1); 
            } else {
                map.put(ch, 1); 
            }
        }
        char mostRepeated = ' ';
        int maxCount = 0;
        for (char ch : map.keySet()) {
            if (map.get(ch) > maxCount) {
                maxCount = map.get(ch);
                mostRepeated = ch;
            }
        }
        System.out.println("Most repeated character: " + mostRepeated);
        System.out.println("Count: " + maxCount);
    }
}