class Accounting{
    public double valueOfSupply; //인스턴스변수
    public Accounting(double valueOfSupply){
        this.valueOfSupply = valueOfSupply;
    }
    public static double vatRate = 0.1;
    public double getVAT() { //인스턴스 메소드
        return valueOfSupply * vatRate;
    }
    public  double getTotal() { //인스턴스 메소드
        return valueOfSupply + getVAT();
    }
}

public class AccountingApp2 {
    public static void main(String[] args) {
        Accounting m1 = new Accounting(10000);
        System.out.println("Value of supply : " + m1.valueOfSupply);
        System.out.println("VAT : " + m1.getVAT());
        System.out.println("Total : " + m1.getTotal());

        System.out.println("------------------");
        
        Accounting m2 = new Accounting(20000);
        System.out.println("Value of supply : " + m2.valueOfSupply);
        System.out.println("VAT : " + m2.getVAT());
        System.out.println("Total : " + m2.getTotal());


    }
 
}