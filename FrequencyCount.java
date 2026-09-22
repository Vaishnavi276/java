class FrequencyCount {
    public static void main(String[] args) {
        String s = "Hello Everyone";
        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                count[ch]++;
            }
        }
        System.out.println("Frequency count of " + s + ":");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " = " + count[i]);
            }
        }
    }
}