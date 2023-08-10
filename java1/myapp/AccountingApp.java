package myapp; //자꾸 CMD에서 실행이 안됨, 나중에 해결할 것 

public class AccountingApp {
    public static void main(String[] args) {
        double valueOfSupply = Double.parseDouble(args[0]);
        double VatRate = 0.1;
        double Expense_Rate = 0.3;
        double vat = valueOfSupply*VatRate;
        double total = valueOfSupply+vat;
        double expense = valueOfSupply*Expense_Rate;
        double income = valueOfSupply-expense;
        double dividend1 = (income)*0.5;
        double dividend2 = (income)*0.3;
        double dividend3 = (income)*0.5;

        System.out.println(("Value of supply : "+valueOfSupply));
        System.out.println("VAT : "+(vat));
        System.out.println("Total : "+total);
        System.out.println("Expense : "+(expense));
        System.out.println("Income : "+(income));
        System.out.println("Dividend 1 : "+dividend1);
        System.out.println("Dividend 2 : "+dividend2);
        System.out.println("Dividend 3 : "+dividend3);
    }
}