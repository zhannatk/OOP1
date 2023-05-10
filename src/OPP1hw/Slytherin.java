package OPP1hw;

public class Slytherin extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;

    public Slytherin(String studentName, int transgressionDistance, int power, int smart, int wise, int witty) {
        super(studentName, transgressionDistance, power);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    @Override
    public String toString() {
        return "Slytherin:" + this.getStudentName() +
                ", magicPower= " + this.getPower() +
                ", transgressionDistance= " + this.getTransgressionDistance() +
                ", smart= " + smart +
                ", wise= " + wise +
                ", witty= " + witty;
    }
    public void compareStudents(Slytherin student) {
        int student1 = this.smart + this.wise + this.witty;
        int student2 = student.smart + student.wise + student.witty;
        if (student1 > student2) {
            System.out.println(this.getStudentName() + " сильнее, чем " + student.getStudentName());
        } else if (student1 < student2) {
            System.out.println(student.getStudentName() + " сильнее " + this.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " и " + this.getStudentName() + " - одинаково сильны.");
        }
    }
}
