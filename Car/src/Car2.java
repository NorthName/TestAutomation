public class Car2 {
    public String model;
    public String color;
    public int seats;

    Car2(String model, String color, int seats){
        this.model = model;
        this.color = color;
        this.seats = seats;

    }

    public void display(){
        System.out.println("Model is : " + model);
        System.out.println("Color is : " + color);
        System.out.println("Seats is : " + seats);
    }
}
