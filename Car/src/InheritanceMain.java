public class InheritanceMain {
    public static void main(String[] args) {
        Car3 c = new Car3();
        c.display();
        System.out.println(c.seats);

        Ferrari f = new Ferrari();
        f.displayFerrari();
        f.display();
        System.out.println(f.seats);

        Car3 cf = new Ferrari();
        System.out.println("CF : " + cf.seats);
        cf.display();
        //cf.displayFerrari();

        //Ferrari fc = new Car3();

    }

}
