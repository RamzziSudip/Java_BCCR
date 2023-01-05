class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}

class Scientist extends EmployeeDynamic {
    private int no_of_publication;
    private int experience;

    public Scientist(String name, int id, int no_of_publication, int experience) {
        super(name, id);
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Scientist{" + "no_of_publication=" + no_of_publication + ", experience=" + experience + "} " + super.toString();
    }
}

class DScientist extends ScientistDynamic {
    private String award;

    public DScientist(String name, int id, int no_of_publication, int experience, String award) {
        super(name, id, no_of_publication, experience);
        this.award = award;
    }

    @Override
    public String toString() {
        return "DScientist{" + "award='" + award + '\'' + "} " + super.toString();
    }
}

class PrintString {
    public static void main(String[] args) {
        EmployeeDynamic emp = new EmployeeDynamic("Oskar Roy", 101);
        ScientistDynamic sci = new ScientistDynamic("Nayomi Smith", 150, 5, 1000);
        DScientistDynamic dSci = new DScientistDynamic(
                "Sir Issac Newton",
                1, 200, 120000,
                "Knighthood");

        System.out.println(emp);
        System.out.println(sci);
        System.out.println(dSci);

    }
}
