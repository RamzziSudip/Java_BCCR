class Demo {
    private int data;

    @Override
    public String toString() {
        return "Demo{" +
                "data=" + data +
                '}';
    }

    public Demo(int data) {
        this.data = data;
    }

    public Demo() {
        this.data = 0;
    }

    public Demo getReference(int newData) {
        this.data = newData;
        return this;
    }

    public static Demo getInstance(int newData) {
        return new Demo(newData);
    }

}

class ReferenceDemo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo);

        Demo demo2 = demo.getReference(3465);
        System.out.println(demo2);

        Demo demo3 = Demo.getInstance(457);
        System.out.println(demo3);

        System.out.println("demo == demo2: " + demo.equals(demo2));
        System.out.println("demo == demo3: " + demo.equals(demo3));

    }
}
