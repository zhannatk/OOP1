package OPP1hw;

public class Puffin extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffin(String studentName, int transgressionDistance, int power, int hardworking, int loyal, int honest) {
        super(studentName, transgressionDistance, power);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff:" + this.getStudentName() +
                ", magicPower= " + this.getPower() +
                ", transgressionDistance= " + this.getTransgressionDistance() +
                ", hardworking= " + hardworking +
                ", loyalty= " + loyal +
                ", honesty= " + honest;
    }
    public void compareStudents(Puffin student) {
        int student1 = this.hardworking + this.loyal + this.honest;
        int student2 = student.hardworking + student.honest + student.loyal;
        if (student1 > student2) {
            System.out.println(this.getStudentName() + " сильнее " + student.getStudentName());
        } else if (student1 < student2) {
            System.out.println(student.getStudentName() + " сильнее " + this.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " и " + this.getStudentName() + " - одинаково сильны.");
        }
    }

}
