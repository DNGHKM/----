class Accounting{
    public double valueOfSupply;
    public double VatRate;
    public double Expense_Rate;
    public double getDividend1() {
        return getIncome()*0.5;
    }
    public double getDividend2() {
        return getIncome()*0.3;
    }
    public double getDividend3() {
        return getIncome()*0.2;
    }
    public double getIncome() {
        return valueOfSupply-getExpense();
    }
    public double getExpense() {
        return valueOfSupply*Expense_Rate;
    }
    public double getTotal() {
        return valueOfSupply+getVAT();
    }
    public double getVAT() {
        return valueOfSupply*VatRate;
    }
    public void print() {
        System.out.println(("Value of supply : "+valueOfSupply));
        System.out.println("VAT : "+getVAT());
        System.out.println("Total : "+getTotal());
        System.out.println("Expense : "+getExpense());
        System.out.println("Income : "+getIncome());
        System.out.println("Dividend 1 : "+getDividend1());
        System.out.println("Dividend 2 : "+getDividend2());
        System.out.println("Dividend 3 : "+getDividend3());
    }
}
public class AccountingClassApp {

    public static void main(String[] args) {
        //instance
        Accounting a1 = new Accounting();
        a1.valueOfSupply =10000;
        a1.VatRate = 0.1;
        a1.Expense_Rate = 0.3;
        a1.print();

        Accounting a2 = new Accounting();
        a2.valueOfSupply =20000;
        a2.VatRate = 0.05;
        a2.Expense_Rate = 0.2;
        a2.print();
    
    }
        // method, class, instance(복제)

}   
