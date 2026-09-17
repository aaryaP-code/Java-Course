public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();

        bobsAccount.setAccountNumber("54321");
        bobsAccount.setAccountBalance(1000);
        bobsAccount.setCustomerName("Bob");
        bobsAccount.setCustomerEmail("bob@gmail.com");
        bobsAccount.setPhoneNumber("XXXXX XXXXX");
        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(250 );
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);
    }
}