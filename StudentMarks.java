public class StudentMarks {
    public static void main(String[] args) {
        String[] names = {"Anushka", "Vaishnavi", "Chahat", "Chanchal", "Mahi"};
        int[][] marks = {
                {80, 75, 90, 85, 70, 88},
                {95, 92, 90, 94, 91, 93},
                {65, 70, 68, 72, 75, 69},
                {88, 84, 86, 90, 87, 89},
                {78, 82, 80, 76, 85, 81}
        };
        double[] percentage = new double[5];
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total = total + marks[i][j];
            }
            percentage[i] = (total / 600.0) * 100;
            System.out.println(names[i] + " Total: " + total
                    + " Percentage: " + percentage[i] + "%");
        }
        int first = 0;
        int second = 0;
        for (int i = 1; i < percentage.length; i++) {
            if (percentage[i] > percentage[first]) {
                second = first;
                first = i;
            } else if (percentage[i] > percentage[second] && i != first) {
                second = i;
            }
        }
        System.out.println("\nTop 2 Students:");
        System.out.println("1. " + names[first] + " - " + percentage[first] + "%");
        System.out.println("2. " + names[second] + " - " + percentage[second] + "%");
    }
}