public class AutomaticPromotionRule {
    public void m1(int a){
        System.out.println("Integer argument");
    }
    public void m1(float f){
        System.out.println("Float argument");
    }

    public static void main(String[] args) {

        AutomaticPromotionRule automaticPromotionRule = new AutomaticPromotionRule();
        automaticPromotionRule.m1(10);
        automaticPromotionRule.m1(10f);
        automaticPromotionRule.m1(10l);
        automaticPromotionRule.m1('a');
        //automaticPromotionRule.m1(10.5)

    }
}
