class MainShow {
    void show() {
        System.out.println("I'm showing from 'Parent Class'");
    }
}

class SubShow1 extends MainShow {
    void show() {
        System.out.println("I'm showing from 'First Sub Class Class'");
    }
}

class SubShow2 extends MainShow{
    void show() {
        System.out.println("I'm showing from 'Second Sub Class Class'");
    }
}

class SubShow3 extends MainShow {
    void show() {
        System.out.println("I'm showing from 'Third Sub Class Class'");
    }
}

class ShowMorphism {
    public static void main(String[] args) {

        MainShow ms = new MainShow();
        ms.show();

        SubShow1 sb1 = new SubShow1();
        sb1.show();

        SubShow2 sb2 = new SubShow2();
        sb2.show();

        SubShow3 sb3 = new SubShow3();
        sb3.show();
    }
}
