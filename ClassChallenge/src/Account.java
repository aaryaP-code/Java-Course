public class Account {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public void depositFunds(double depositAmount) {

        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made, New balance is " + this.accountBalance);
    }

    public void withdrawFunds(double withdrawalFunds) {

        if(this.accountBalance - withdrawalFunds < 0) {
            System.out.println("Insufficient Balance! You have " + this.accountBalance + " in your account.");
        } else {
            this.accountBalance -= withdrawalFunds;
            System.out.println("Withdrawal of " + withdrawalFunds + " made, New balance is " + this.accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}