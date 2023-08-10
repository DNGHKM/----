public class AccountingifApp {
    public static void main(String[] args) {
        double valueOfSupply = Double.parseDouble(args[1]);
        double VatRate = 0.1;
        double Expense_Rate = 0.3;
        double vat = valueOfSupply*VatRate;
        double total = valueOfSupply+vat;
        double expense = valueOfSupply*Expense_Rate;
        double income = valueOfSupply-expense;

        double dividend1;
        double dividend2;
        double dividend3;

        if(income>10000) {
            dividend1 = (income)*0.5;
            dividend2 = (income)*0.3;
            dividend3 = (income)*0.5;
        } else {
            dividend1 = (income)*1;
            dividend2 = (income)*0;
            dividend3 = (income)*0; 
        }

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
