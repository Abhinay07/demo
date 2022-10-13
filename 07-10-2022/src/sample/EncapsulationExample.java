package sample;

public class EncapsulationExample {

    private String password = "@4343*(&";

    // getter is used to get value which is set.
    public String getPassword() {
        return password;
    }

    // setter will set value to variable.
    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        EncapsulationExample encapsulationExample = new EncapsulationExample();
        System.out.println(encapsulationExample.password);
    }
}
