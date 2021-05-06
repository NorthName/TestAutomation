public class SameLevelRule {
    public void m1(String string){
        System.out.println("String version");
    }
    public void m1(StringBuffer stringBuffer){
        System.out.println("StringBuffer version");
    }

    public static void main(String[] args) {
        SameLevelRule sameLevelRule = new SameLevelRule();
        sameLevelRule.m1("Name");
        sameLevelRule.m1(new StringBuffer("NameSB"));
        //sameLevelRule.m1(null);
    }
}
