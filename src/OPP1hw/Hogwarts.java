package OPP1hw;

public class Hogwarts {
    private String studentName;
    private int transgressionDistance;
    private int power;

    public Hogwarts(String studentName, int transgressionDistance, int power) {
        this.studentName = studentName;
        this.transgressionDistance = transgressionDistance;
        this.power = power;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }


    public int getPower() {
        return power;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }


    public void setPower(int power) {
        this.power = power;
    }

    public void compareStudent(Hogwarts student) {
        int student1 = this.transgressionDistance + this.power;
        int student2 = student.getTransgressionDistance() + student.getPower();
        if (student1 > student2) {
            System.out.println(this.getStudentName() + " сильнее, чем " + student.getStudentName());
        } else if (student1 < student2) {
            System.out.println(student.getStudentName() + " сильнее " + this.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " и " + this.getStudentName() + " - одинаково сильны.");
        }
    }
}
