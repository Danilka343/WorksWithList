package Lesson_3.domain;

public class Student extends Person implements Comparable<Student> {
    private int studentId;
    private int averageMark;

    public Student(int studentId, String name, String lastName, int averageMark) {
        super(name, lastName);
        this.studentId = studentId;
        this.averageMark = averageMark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        return averageMark == student.averageMark;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + studentId;
        result = 31 * result + averageMark;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name=" + super.getName() +
                ", lastName=" + super.getLastName() +
                ", averageMark=" + averageMark +
                '}';
    }

    @Override
    public int compareTo(Student o) {  //sorting from StudentId
        if (this.getStudentId() > o.getStudentId()) {
            return 1;
        } else if (this.getStudentId() < o.getStudentId()) {
            return -1;
        }
        return 0;
    }
}

