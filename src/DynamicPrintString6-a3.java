import java.util.Scanner;

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

class DynamicPrintString {

    private static void display(EmployeeDynamic ref) {
        System.out.println(ref);
    }

    public static void main(String[] args) {
        System.out.println("Enter your choice: ");
        System.out.println("[1] Employee");
        System.out.println("[2] Scientist");
        System.out.print("[3] DScientis\n> ");
      
        EmployeeDynamic emp = new EmployeeDynamic("None", 0);
      
        int choice = new Scanner(System.in).nextInt();
        if (choice == 1)
          emp = new EmployeeDynamic("Oskar Roy", 101);
        else if (choice == 2)
          emp = new ScientistDynamic("Nayomi Smith", 150, 5, 1000);
        else if (choice == 3)
          emp = new DScientistDynamic("Sir Issac Newton", 1, 200, 120000, "Knighthood");
        else
        {
          System.out.println("Invalid option");
          System.exit(1);
        }
        display(emp);
    }
}
