package sample;

public class Maruthi800 implements Car{

    @Override
    public void Engine() {
        System.out.println("800CC");
    }

    @Override
    public void Speed() {
        System.out.println("80KPH");
    }

    @Override
    public void mileage() {
        System.out.println("25KPH");
    }

    public void owner(){
        System.out.println("Maruthi");
    }
}
