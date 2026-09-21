public class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "aabbcdeeff";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("No non-repeating character");
    }
}