package assignment.three;

class EmployeeDynamic {
    private String name;
    private int id;

    public EmployeeDynamic(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}

class ScientistDynamic extends EmployeeDynamic {
    private int no_of_publication;
    private int experience;

    public ScientistDynamic(String name, int id, int no_of_publication, int experience) {
        super(name, id);
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Scientist{" + "no_of_publication=" + no_of_publication + ", experience=" + experience + "} " + super.toString();
    }
}

class DScientistDynamic extends ScientistDynamic {
    private String award;

    public DScientistDynamic(String name, int id, int no_of_publication, int experience, String award) {
        super(name, id, no_of_publication, experience);
        this.award = award;
    }

    @Override
    public String toString() {
        return "DScientist{" + "award='" + award + '\'' + "} " + super.toString();
    }
}

public class DynamicPrintString6 {

    private static void display(EmployeeDynamic ref) {
        System.out.println(ref);
    }

    public static void main(String[] args) {

        EmployeeDynamic emp = new EmployeeDynamic("Oskar Roy", 101);
        EmployeeDynamic sci = new ScientistDynamic("Nayomi Smith", 150, 5, 1000);
        EmployeeDynamic dSci = new DScientistDynamic("Sir Issac Newton", 1, 200, 120000, "Knighthood");

        display(emp);
        display(sci);
        display(dSci);
    }
}
