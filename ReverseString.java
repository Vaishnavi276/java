public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello world ";
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;      
        while (start < end) {
            if (arr[start] == ' ') {
                start++;
            } else if (arr[end] == ' ') {
                end--;
            } else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(new String(arr));
    }
}