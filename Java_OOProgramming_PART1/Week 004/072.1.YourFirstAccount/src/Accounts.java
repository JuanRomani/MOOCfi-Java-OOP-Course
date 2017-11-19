public class Accounts {

    /*
        Introduction to object-oriented programming
     */

    public static void main(String[] args) {
        Account juansAccount = new Account("Juan's Account", 100.00); // Creation of Account object

        juansAccount.deposit(20.0); // Using Account object method

        System.out.println(juansAccount);
    }

}
