//Challenge 52 : Program to create a Course class with static and instance variables, constructors, and methods to enroll and unenroll students.
public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
        } else {
            System.out.println("Course is full.");
        }
    }

    void unenrollStudent(String studentName) {
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                for (int j = i; j < enrollments - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[--enrollments] = null;
                System.out.println("Student removed");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public static void main(String[] args) {
        Course javaCourse = new Course("Java Programming");
        javaCourse.enrollStudent("Alice");
        javaCourse.enrollStudent("Bob");
        javaCourse.unenrollStudent("Alice");
    }
}

