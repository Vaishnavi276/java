import java.util.HashMap;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        HashMap<Character, Integer> map = new HashMap<>();
        if (str1.length() != str2.length()) {
            System.out.println("Not anagram");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (!map.containsKey(ch)) {
                System.out.println("Not anagram");
                return;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        if (map.isEmpty()) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
}