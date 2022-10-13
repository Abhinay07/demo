package sample;

public class HelloWorld {

    public static void main(String[] args) {
        int x= 10;
        String name = "Satish";
        System.out.println("Helllo");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.test2();
        test();
        helloWorld.test3();

    }

    public void car(){
        System.out.println("Maruthi 800");
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
