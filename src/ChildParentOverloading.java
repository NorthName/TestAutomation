class A {

}

class B extends A{

}

public class ChildParentOverloading {
    public void m1(A a){
        System.out.println("Parent");
    }
    public void m1(B b){
        System.out.println("Child");
    }
    public static void main(String[] args) {
        ChildParentOverloading childParentOverloading = new ChildParentOverloading();

        A a = new A();
        childParentOverloading.m1(a);

        B b = new B();
        childParentOverloading.m1(b);

        A ab = new B();
        childParentOverloading.m1(ab);
    }
}
