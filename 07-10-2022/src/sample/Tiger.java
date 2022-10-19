package sample;

public class Tiger extends Animal{

    @Override
    public String sound() {
        return "ERrrr";
    }

    @Override
    public String speed() {
        return "100MPH";
    }

    @Override
    public String isDangerous() {
        return "YES";
    }

    @Override
    public String fly() {
        return "Can't Fly";
    }

    
}
