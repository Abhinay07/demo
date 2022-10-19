package sample;

public class Cat extends Animal{

    @Override
    public String sound() {
        return "Meow Meow";
    }

    @Override
    public String speed() {
        return "5MPH";
    }

    @Override
    public String isDangerous() {
        return "No";
    }

    @Override
    public String fly() {
        return "Can't Fly";
    }

    public String Eyes(){
        return "Blue Eyes";
    }

    public static void main(String[] args) {
        Cat cc = new Cat();
        cc.sound();
        cc.isPet();
    }
}
