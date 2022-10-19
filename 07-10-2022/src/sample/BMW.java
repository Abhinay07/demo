package sample;

public class BMW implements Car{

    @Override
    public void Engine() {
        System.out.println("2000CC");
    }

    @Override
    public void Speed() {
        System.out.println("350KPH");
    }

    @Override
    public void mileage() {
        System.out.println("15KPH");
    }
}
