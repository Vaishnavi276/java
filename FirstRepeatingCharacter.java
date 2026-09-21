import java.util.HashMap;
public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "Hello world";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (map.containsKey(ch)) {
                System.out.println("First repeating character: " + ch);
                break;
            } else {
                map.put(ch, 1);
            }
        }
    }
}