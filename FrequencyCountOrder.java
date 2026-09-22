class FrequencyCountOrder {
    public static void main(String[] args) {
        String s = "Hello Everyone";
        int[] count = new int[256];
        boolean[] seen = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                count[ch]++;
                seen[ch] = true;
            }
        }
        System.out.println("Frequency count of " + s + ":");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ' && seen[ch]) {
                System.out.println(ch + " = " + count[ch]);
                seen[ch] = false;
            }
        }
    }
}