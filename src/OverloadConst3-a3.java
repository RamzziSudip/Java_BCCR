class Area {
    double length;
    double width;

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

class Volume extends Area {
    double height;

    public Volume(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public Volume(double length, double width) {
        super(length, width);
        this.height = 0;
    }
    public void display(){
        double l = this.length;
        double w = this.width;
        double h = this.height;
        double a = 2 * ((l * w) + (w * h) + (h * l));
        double v = l * w * h;
        System.out.print("Area: "+a);
        if (h != 0){
            System.out.print(" and Volume: "+v);
        }
        System.out.println();
    }
}

class OverloadConst {
    public static void main(String[] args) {
        new Volume(105,24,63).display();
        new Volume(105,24).display();
    }
}
