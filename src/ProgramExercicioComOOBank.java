import java.util.Scanner;

import entities.ClassExercicioOOBank;

public class ProgramExercicioComOOBank {
    
    public static void main(String[] args) {
        
        ClassExercicioOOBank account;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Account creation:");
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        
        System.out.println("\nDeposit:");
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new ClassExercicioOOBank(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new ClassExercicioOOBank(accountNumber, accountHolder);
        }

        System.out.println("\nAccount data:");
        System.out.println(account);

        System.out.println("\nDeposit:");
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println("\nWithdraw:");
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");

        System.out.println(account);

        sc.close();
    }

}
