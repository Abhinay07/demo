package sample;

public class Main {

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample(20);
        System.out.println(obj.x);
        //obj.test(obj.x);
        ConstructorExample obj1 = new ConstructorExample("Rakesh");
        System.out.println(obj1.name);
        ConstructorExample obj2 = new ConstructorExample(10,"Vamshi");
        System.out.println(obj2.x);
        System.out.println(obj2.name);

        EncapsulationExample ensObj = new EncapsulationExample();
        ensObj.setPassword("7as$^h8*");
        System.out.println(ensObj.getPassword());
    }
}
