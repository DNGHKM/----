public class AccountingArrayLoopApp {
    public static void main(String[] args) {
        double valueOfSupply = Double.parseDouble(args[1]);
        double VatRate = 0.1;
        double Expense_Rate = 0.3;
        double vat = valueOfSupply*VatRate;
        double total = valueOfSupply+vat;
        double expense = valueOfSupply*Expense_Rate;
        double income = valueOfSupply-expense;


        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        System.out.println("Value of supply : "+valueOfSupply);
        System.out.println("VAT : "+vat);
        System.out.println("Total : "+total);
        System.out.println("Expense : "+expense);
        System.out.println("Income : "+income);

        int i=0;
        while (i<dividendRates.length) {
            System.out.println("Dividend : "+(income*dividendRates[i]));
            i= i+1; 
        }
        
        
    }
}
