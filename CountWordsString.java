import java.util.Scanner;
public class CountWordsString {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 System.out.println("Enter string:");
        String text = sc.nextLine().trim();
        System.out.println(text);
if(text.isEmpty()){
    System.out.println(0);
}else{
    String[] words = text.split("\\s+");
    System.out.println(words.length);
}
}
}
