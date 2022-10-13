package sample;

public class ParentClass {

    public static void main(String[] args) {
        int x= 10;
        String name = "Satish";
        System.out.println("Helllo");
        ParentClass helloWorld = new ParentClass();
        helloWorld.test2();
        test();
        helloWorld.test3();

    }

    public void car(){
        System.out.println("Maruthi 800");
    }

    public void land(){
        System.out.println("100 Acres");
    }

    public static void test(){
        System.out.println("Im in test Method");
    }

    public void test2(){
        System.out.println("Calling using object");
    }

    private void test3(){
        System.out.println("Not Allowed to child");
    }
}
