public class MultilevelInheritanceMain {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA3();

        B3 b = new B3();
        b.methodA3();
        b.methodB3();

        C3 c = new C3();
        c.methodA3();
        c.methodB3();
        c.methodC3();
    }
}
