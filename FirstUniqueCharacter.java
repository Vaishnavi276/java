import java.util.HashMap;

class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (frequency.get(ch) == 1) {
                return i;
            }
        }
        return -1;
    }
}