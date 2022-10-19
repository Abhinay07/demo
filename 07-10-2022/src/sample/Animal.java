package sample;

public abstract class Animal {

    // Abstract & Non-Abstract Methods
    public abstract String sound(); // Common features

    public abstract String speed();

    public abstract String isDangerous();

    public void isPet(){  // common implementation
        System.out.println("Yes!! Its pet animal");
    }

    public abstract String fly();

}
