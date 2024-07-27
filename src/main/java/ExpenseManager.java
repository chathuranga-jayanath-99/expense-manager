import java.sql.SQLOutput;
import java.util.Scanner;

public class ExpenseManager {
    public static final int WALLET_OPTION = 1;

//    public static MoneyAccount executeSelectedOption(int selectedOption) {
//        if (selectedOption == WALLET_OPTION) {
//            return new Wallet();
//        }
//        return null;
//    }

    public static void printActionOptions() {
        System.out.println("1. View current salary");
        System.out.println("2. Mark expense.");
        System.out.println("3. Mark income.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Expense Manager!!!");
//        System.out.println("Enter option");
//        System.out.println("1. Create a wallet.");
//
//        int selectedOption = scanner.nextInt();
//        MoneyAccount moneyAccount = ExpenseManager.executeSelectedOption(selectedOption);

        System.out.println("Enter current value of the wallet: ");
        float currentValue = scanner.nextFloat();

        Wallet wallet = new Wallet(currentValue);
        int actionOption;
        do {
            ExpenseManager.printActionOptions();
            actionOption = scanner.nextInt();
            if (actionOption == 1) {
                System.out.println("Your current amount in wallet is " + wallet.getCurrentValue());
            } else if (actionOption == 2) {
                // create expense
            } else if (actionOption == 3) {
                // create income
            }
        } while (actionOption == 0);
    }
}
