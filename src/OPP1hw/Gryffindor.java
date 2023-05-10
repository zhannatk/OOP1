package OPP1hw;

public class Gryffindor extends Hogwarts {
    private int nobleness;
    private int honor;
    private int bravery;

    public Gryffindor(String studentName, int transgressionDistance, int power, int nobleness, int honor, int bravery) {
        super(studentName, transgressionDistance, power);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobleness() {
        return nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return
                "Gryffindor: " + this.getStudentName() +
                        ", magicPower= " + this.getPower() +
                        ", transgressionDistance= " + this.getTransgressionDistance() +
                        ", nobleness= " + nobleness +
                        ", honor= " + honor +
                        ", bravery= " + bravery;
    }

    public void compareStudents(Gryffindor student) {
        int student1 = this.nobleness + this.honor + this.bravery;
        int student2 = student.nobleness + student.honor + student.bravery;
        if (student1 > student2) {
            System.out.println(this.getStudentName() + " сильнее, чем " + student.getStudentName());
        } else if (student1 < student2) {
            System.out.println(student.getStudentName() + " сильнее " + this.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " и " + this.getStudentName() + " - одинаково сильны.");
        }
    }

}

