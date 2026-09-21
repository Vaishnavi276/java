public class ReverseWords {
    public static String reverseCharacters(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            result += reversed + " ";
        }
        return result.trim();
    }   
     public static void main(String[] args) {

        System.out.println(reverseCharacters("Hello World"));
    }
}
