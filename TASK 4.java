import java.util.ArrayList;

class Students {
    String name;
    double gpa;

    Students(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}

public class Student {
    public static void main(String[] args) {

        ArrayList<Students> students = new ArrayList<>();  // Use Students objects

        students.add(new Students("Ali", 3.8));
        students.add(new Students("Sara", 3.2));
        students.add(new Students("Ahmed", 1.9));
        students.add(new Students("Ayesha", 3.9));
        students.add(new Students("Bilal", 2.5));

        students.removeIf(s -> s.gpa < 2.0);

        Students topper = students.get(0);
        for (Students s : students) {
            if (s.gpa > topper.gpa) {
                topper = s;
            }
        }

        int deanList = 0;
        for (Students s : students) {
            if (s.gpa > 3.5) {
                deanList++;
            }
        }

        System.out.println("Topper: " + topper.name + " GPA: " + topper.gpa);
        System.out.println("Students eligible for Dean's List: " + deanList);
    }
}
