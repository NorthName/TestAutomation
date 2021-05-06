public class ChildParentOverloadingRule {

    public void m1(String str){
        System.out.println("String Version");
    }

    public void m1(Object object){
        System.out.println("Object version");
    }

    public static void main(String[] args) {
        ChildParentOverloadingRule childParentOverloadingRule = new ChildParentOverloadingRule();
        childParentOverloadingRule.m1(new Object());
        childParentOverloadingRule.m1("String");
        childParentOverloadingRule.m1(null);
    }
}
