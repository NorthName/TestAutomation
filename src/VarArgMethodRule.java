public class VarArgMethodRule {

    public void m1(int i){
        System.out.println("Not var arg method");
    }

    public void m1(int i,int j){
        System.out.println("Not var arg method with 2 args");
    }

    public void m1(int... i){
        System.out.println("Var arg method");
    }

    public static void main(String[] args) {
        VarArgMethodRule varArgMethodRule = new VarArgMethodRule();
        varArgMethodRule.m1(10);
        varArgMethodRule.m1(10, 10);
        varArgMethodRule.m1();
    }
}
