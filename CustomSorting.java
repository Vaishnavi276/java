import java.util.Arrays;
import java.util.Comparator;
public class CustomSorting {
    public static void main(String[] args) {
        String[] names = {"Vaishnavi", "Chahat", "Sakshi","Paras", "Oshika", "Khushi","Sujal"};
        Arrays.sort(names, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                }
                return s1.compareTo(s2);
            }
        });
        System.out.println(Arrays.toString(names));
    }
}