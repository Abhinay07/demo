package sample;

public class ChildClass extends ParentClass{

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        parentClass.test2();
        ChildClass cc = new ChildClass();
        cc.car();
        cc.land();
    }

    @Override
    public void car() {
        super.car();
       // System.out.println("Modified Car");
    }

    @Override
    public void land() {
       System.out.println("200 Acres");
    }

    public int test3(){
        System.out.println("return type testing");
        return 10;
    }

    public void stocks(){
        System.out.println("Investment in stocks");
    }

    void noAccessModifier(){
        System.out.println("No Access Modifier");
    }
}
