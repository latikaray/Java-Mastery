//Challenge 94 : Use of collections and priority queue
import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade();
            }
        });

        queue.offer(new Student("Latika", 'B'));
        queue.offer(new Student("Tanisha", 'C'));
        queue.offer(new Student("Shwetan", 'A'));
        queue.offer(new Student("Pranav", 'D'));
        queue.offer(new Student("Om", 'A'));

        System.out.printf("Queue is: %s\n", queue);
        Student s1 = queue.poll();
        System.out.printf("Got %s (%s)\n", s1, s1 != null ? s1.getName() : "null");
        Student s2 = queue.poll();
        System.out.printf("Got %s (%s)\n", s2, s2 != null ? s2.getName() : "null");
        Student s3 = queue.poll();
        System.out.printf("Got %s (%s)\n", s3, s3 != null ? s3.getName() : "null");
        Student s4 = queue.poll();
        System.out.printf("Got %s (%s)\n", s4, s4 != null ? s4.getName() : "null");
        Student s5 = queue.poll();
        System.out.printf("Got %s (%s)\n", s5, s5 != null ? s5.getName() : "null");
    }

    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }
}
