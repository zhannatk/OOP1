package OPP1hw;

public class Kogtevran extends Hogwarts {
    private int cunning;
    private int determined;
    private int ambitious;

    public Kogtevran(String studentName, int transgressionDistance, int power, int cunning, int determined, int ambitious) {
        super(studentName, transgressionDistance, power);
        this.cunning = cunning;
        this.determined = determined;
        this.ambitious = ambitious;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermined() {
        return determined;
    }

    public void setDetermined(int determined) {
        this.determined = determined;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    @Override
    public String toString() {
        return "Kogtevran: " + this.getStudentName() +
                ", magicPower= " + this.getPower() +
                ", transgressionDistance= " + this.getTransgressionDistance() +
                ", cunning= " + cunning +
                ", determined= " + determined +
                ", ambitious= " + ambitious;
    }

    public void compareStudents(Kogtevran student) {
        int student1 = this.cunning + this.determined + this.ambitious;
        int student2 = student.cunning + student.determined + student.ambitious;
        if (student1 > student2) {
            System.out.println(this.getStudentName() + " сильнее " + student.getStudentName());
        } else if (student1 < student2) {
            System.out.println(student.getStudentName() + " сильнее " + this.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " и " + this.getStudentName() + " - одинаково сильны.");
        }
    }
}
