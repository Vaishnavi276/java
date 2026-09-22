abstract class Person { 
    private String name; 
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract double calculatePercentage();
    public abstract int calculateTotal();
}
class Student extends Person { 
    private int[] marks;
    public Student(String name, int[] marks) {
        super(name);
        this.marks = marks;
    }
    public int calculateTotal() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        return total;
    }
    public double calculatePercentage() {
        return (calculateTotal() / 600.0) * 100;
    }
    public void displayDetails() {
        System.out.println(getName()
                + " Total: " + calculateTotal()
                + " Percentage: " + calculatePercentage() + "%");
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Anushka", new int[]{80, 75, 90, 85, 70, 88}),
                new Student("Vaishnavi", new int[]{95, 92, 90, 94, 91, 93}),
                new Student("Chahat", new int[]{65, 70, 68, 72, 75, 69}),
                new Student("Chanchal", new int[]{88, 84, 86, 90, 87, 89}),
                new Student("Mahi", new int[]{78, 82, 80, 76, 85, 81})
        };
        Student first = null;
        Student second = null;
        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
            if (first == null || students[i].calculatePercentage() > first.calculatePercentage()) {
                second = first;
                first = students[i];
            } else if (second == null || students[i].calculatePercentage() > second.calculatePercentage()) {
                second = students[i];
            }
        }
        System.out.println("\nTop 2 Students:");
        System.out.println("1. " + first.getName() + " - " + first.calculatePercentage() + "%");
        System.out.println("2. " + second.getName() + " - " + second.calculatePercentage() + "%");
    }
}