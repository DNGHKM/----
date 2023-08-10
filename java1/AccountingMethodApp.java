public class AccountingMethodApp {
    public static double valueOfSupply;
    public static double VatRate;
    public static double Expense_Rate;

    public static void main(String[] args) {
        valueOfSupply = 10000;
        VatRate = 0.1;
        Expense_Rate = 0.3;

        print();
    }
        public static void print() {
        System.out.println(("Value of supply : "+valueOfSupply));
        System.out.println("VAT : "+getVAT());
        System.out.println("Total : "+getTotal());
        System.out.println("Expense : "+getExpense());
        System.out.println("Income : "+getIncome());
        System.out.println("Dividend 1 : "+getDividend1());
        System.out.println("Dividend 2 : "+getDividend2());
        System.out.println("Dividend 3 : "+getDividend3());
    }

    
    public static double getDividend1() {
        return getIncome()*0.5;
    }
    public static double getDividend2() {
        return getIncome()*0.3;
    }
    public static double getDividend3() {
        return getIncome()*0.2;
    }

    public static double getIncome() {
        return valueOfSupply-getExpense();
    }

    public static double getExpense() {
        return valueOfSupply*Expense_Rate;
    }

    public static double getTotal() {
        return valueOfSupply+getVAT();
    }

    public static double getVAT() {
        return valueOfSupply*VatRate;
    }
}   
