package src.sample;

public class ChildTest extends ParentTest{

    /*@Override
    public String test() {
        return "From Child Class";
    }*/

    public String test(String s){
        return s;
    }

    public static void main(String[] args) {
        ParentTest ct = new ChildTest();
        String s = ct.test();
        System.out.println(s);
       /* String s1 = ct.test("ComplieTime");
        System.out.println(s1);*/
    }
}
