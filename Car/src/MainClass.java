public class MainClass {
    public static void main(String[] args) {


    Car c = new Car();
    c.initialize("Model S", "Red", 4);

    Car c1 = new Car();
    c1.initialize("Model S2", "Black", 2);

    c.display();
    c1.display();

    }
}
