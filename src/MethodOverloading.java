public class MethodOverloading {
    public void method1(){
        System.out.println("No argument");
    }
    public void method1(int i){
        System.out.println("Integer argument : " +i );
    }
    public void method1(int j, float i){
        System.out.println("Integer argument : " +i );
    }
    public void method1(float j, int i){
        System.out.println("Integer argument : " +i );
    }
    public void method1(int i, int j){
        System.out.println("2 Integer argument : " +i );
    }
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.method1();
        methodOverloading.method1(10);
    }
}
