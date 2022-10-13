package sample;

public class HDFCBank extends RBIBank{

    public static void main(String[] args) {
        HDFCBank hdfcBank = new HDFCBank();
        hdfcBank.interestRate();
        hdfcBank.interestRate(10);
        String rtnType = hdfcBank.interestRate(10,10);
        System.out.println(rtnType);
    }

    @Override
    public void interestRate() {
        System.out.println("No parameters");
    }

    public void interestRate(int homeLoan){
        System.out.println("Only single int parameter");
    }

    public String interestRate(int homeLoan,int personalLoan){
        System.out.println(6);
        return "Interest Rate Returned";
    }

    public void interestRate(String age){
        System.out.println(8);
    }

    public int interestRate(String homeLoan,int personalLoan){
        System.out.println(6);
        return 6;
    }

    public int interestRate(String homeLoan,String personalLoan){
        System.out.println(6);
        return 6;
    }
}
