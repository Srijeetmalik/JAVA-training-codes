public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;

    BankAccount account;

    System.out.print("1. Regular Account\n2. Savings Account\nChoose Account Type: ");
    choice = sc.nextInt();

    if (choice == 1) {
        account = new BankAccount();
        account.inputData(); 
    } else if (choice == 2) {
        account = new SavingsAccount("", 0);
        account.inputData(); 
    } else {
        System.out.println("Invalid choice. Exiting program.");
        return;
    }

    while (true) {
        System.out.println("\n--- Bank Account Menu ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Account Information");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter deposit amount: ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;
            case 2:
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = sc.nextDouble();
                account.withdraw(withdrawalAmount);
                break;
            case 3:
                account.display();
                break;
            case 4:
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        if (choice == 4) {
            break;
        }
    }
}