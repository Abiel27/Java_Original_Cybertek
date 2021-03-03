package src.day35_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.setInfo("Saidullo", "1234567898");

        account1.getInfo();

        account1.deposit(100);  // available: 100

        account1.withdraw(80); //avilable: 20

        account1.withdraw(20); // available: 0

        account1.deposit(100000); // available: 100000

        account1.showBalance();


        BankAccount account2 = new BankAccount();

        account2.setInfo("Walid", "789456123");

        account2.deposit(200);

        account1.deposit(3000);
        account1.withdraw(50000);

        account1.showBalance();
        account2.showBalance();








    }

}
