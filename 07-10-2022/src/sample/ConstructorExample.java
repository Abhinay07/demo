package sample;

public class ConstructorExample {

    int x;
    String name;
    // Construtor is method but it won't have return type
    // consturutor will have same name as class name
    // consturutor is used to initialze values in a class.
    // ByDefault jvm will take empty construtor.
    /*public ConstructorExample(){

    }*/
    public ConstructorExample(int y){
        this.x = y; // this is a keyword which represents current object.
    }

    public ConstructorExample(String nameValue){
        this.name = nameValue;
    }

    public ConstructorExample(int y, String nameValue){
        this.x = y;
        this.name = nameValue;
    }

    public void test(int x){
        for (int i=0;i<=x;i++){
            System.out.println(i);
        }
    }
}
