class Tester {
    public static double pi;

    static {
        Tester.pi = (double) 22 / 7;
        System.out.println("Initialized the value of pi [Static Block]");
    }

    public Tester() {
        System.out.println(Tester.pi + " is the value of pi" + " [Constructor]");
    }
}

class StaticBlock {

    public static void main(String[] args) {
        Tester test = new Tester();
        System.out.println("After initialising class [Main Method]");
    }
}
