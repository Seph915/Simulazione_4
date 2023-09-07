public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("fabio", 15, 30.0);
        students[1] = new Student("gianni", 16, 18.0);
        students[2] = new Student("andrea", 17, 18.0);

        printNameFirstHalf(students);

        for (Student student : students) {
            double grade = student.getAverageGrade();
            if (student.getAverageGrade()< 20.0) {
                System.out.println(student.getAverageGrade());
            }
        }
    }
    static void printNameFirstHalf(Student[] students) {
        for (Student student : students) {
            String name = student.getName();
            System.out.println(name.substring(0 , name.length()/2));
        }
      }
    }

