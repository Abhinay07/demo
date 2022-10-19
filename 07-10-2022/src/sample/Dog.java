package sample;

public class Dog extends Animal {

    @Override
    public String sound() {
        return "Boo";
    }

    @Override
    public String speed() {
        return "10MPH";
    }

    @Override
    public String isDangerous() {
        return "NO";
    }

    @Override
    public String fly() {
        return "Can't Fly";
    }

    public void isNonVeg(){
        System.out.println("No its not a meat");
    }

    public String type(){
        return "Dolmation";
    }
}
