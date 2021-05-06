public class HierarchicalInheritanceMain {
    public static void main(String[] args) {
        B2 b = new B2();
        b.methodB2();
        b.methodA2();

        C2 c = new C2();
        c.methodC();
        c.methodA2();
    }
}
