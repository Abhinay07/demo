package sample;

public class ChildClass extends HelloWorld{

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.test2();
        ChildClass cc = new ChildClass();
        cc.car();
    }

    @Override
    public void car() {
       // super.car();
        System.out.println("Modified Car");
    }
}
