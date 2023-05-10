package OPP1hw;
import java.util.Random;
public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
            Gryffindor harry = new Gryffindor("Harry Potter", num(), num(), num(), num(), num());
            Gryffindor hermione = new Gryffindor("Hermione Granger", num(), num(), num(), num(), num());
            Gryffindor ron = new Gryffindor("Ron Weasley", num(), num(), num(), num(), num());

        Slytherin draco  = new Slytherin("Draco Malfoy", num(),num(),num(),num(),num());
        Slytherin graham  = new Slytherin("Graham Montague", num(),num(),num(),num(),num());
        Slytherin gregory  = new Slytherin("Gregory Goyle", num(),num(),num(),num(),num());

        Puffin zachariah  = new Puffin("Zachariah Smith",num(),num(),num(),num(),num());
        Puffin cedric  = new Puffin("Cedric Diggory", num(),num(),num(),num(),num());
        Puffin justin  = new Puffin("Justin Finch-Fletchley", num(),num(),num(),num(),num());

        Kogtevran zhou  = new Kogtevran("Zhou Chang", num(),num(),num(),num(),num());
        Kogtevran padma  = new Kogtevran("Padma Patil", num(),num(),num(),num(),num());
        Kogtevran marcus  = new Kogtevran("Marcus Belby", num(),num(),num(),num(),num());

        System.out.println("Ученики Грифиндорора:");
        printAllInfo(harry);
        printAllInfo(hermione);
        printAllInfo(ron);
        System.out.println("Ученики Слизерина:");
        printAllInfo(draco);
        printAllInfo(graham);
        printAllInfo(gregory);
        System.out.println("Ученики пуфендуя:");
        printAllInfo(zachariah);
        printAllInfo(cedric);
        printAllInfo(justin);
        System.out.println("Ученики когтервана:");
        printAllInfo(zhou);
        printAllInfo(padma);
        printAllInfo(marcus);

        System.out.println();

        System.out.println("Сравнение учеников одного факультета:");

        harry.compareStudents(hermione);
        draco.compareStudents(graham);
        cedric.compareStudents(zachariah);
        zhou.compareStudents(marcus);
        System.out.println();

        System.out.println("Сравнение учеников Хогвартса:");
        harry.compareStudent(zachariah);
        draco.compareStudent(marcus);
        ron.compareStudent(zhou);
        cedric.compareStudent(hermione);
        justin.compareStudent(padma);
        gregory.compareStudent(zachariah);
//
//        Gryffindor [] gryffindors = {
//                new Gryffindor("Гарри Поттер",num(),num(),num(),num(),num()),
//                new Gryffindor("Гермиона Грейнджер", num(),num(),num(),num(),num()),
//                new Gryffindor("Рон Уизл",num(),num(),num(),num(),num()),
//        };
//        Slytherin [] slytherins = {
//                new Slytherin("Драко Малфой", num(),num(),num(),num(),num()),
//                new Slytherin("Грэхэм Монтегю", num(),num(),num(),num(),num()),
//                new Slytherin("Грегори Гойл", num(),num(),num(),num(),num()),
//        };
//
//        Puffin [] puffins = {
//                new Puffin("Захария Смит", num(),num(),num(),num(),num()),
//                new Puffin("Седрик Диггори", num(),num(),num(),num(),num()),
//                new Puffin("Джастин Финч-Флетчли", num(),num(),num(),num(),num()),
//        };
//        Kogtevran [] kogtevrans = {
//                new Kogtevran("Чжоу Чанг", num(),num(),num(),num(),num()),
//                new Kogtevran("Падма Патил", num(),num(),num(),num(),num()),
//                new Kogtevran("Маркус Белби", num(),num(),num(),num(),num()),
//        };

//
//        System.out.println("Список студентов Гриффиндора:");
//
//        for (Gryffindor gryffindor : gryffindors) {
//            System.out.println(gryffindor.toString());
//
//        }
//        System.out.println();
//
//        System.out.println("Список студентов Слизерина:");
//        for (Slytherin slytherin : slytherins) {
//            System.out.println(slytherin.toString());
//        }
//        System.out.println();
//        System.out.println("Список студентов Пуффендуя:");
//        for (Puffin puffin : puffins) {
//            System.out.println(puffin.toString());
//        }
//        System.out.println();
//        System.out.println("Список студентов Когтеврана:");
//        for (Kogtevran kogtevran : kogtevrans) {
//            System.out.println(kogtevran.toString());
//        }
//        System.out.println();
    }
    static int num() {
        return random.nextInt(100);
    }


public static void printAllInfo (Hogwarts student) {
        System.out.println(student.toString());
    }




}