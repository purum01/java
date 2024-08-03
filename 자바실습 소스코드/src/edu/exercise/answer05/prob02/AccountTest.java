package edu.exercise.answer05.prob02;

public class AccountTest {
    public static void main(String[] args) {
        try {
            NormalAccount normalAccount = new NormalAccount("정상-001", 3000);
            DeficitAccount deficitAccount = new DeficitAccount("마이너스-001", 2000);
            LoanAccount loanAccount = new LoanAccount("신용-001", 1000);

            normalAccount.deposit(5000);
            deficitAccount.deposit(5000);
            loanAccount.deposit(5000);
         
            System.out.println("\n // 5,000 원씩 입급 후 printBalanceInfo 메서드를 호출하여 계좌정보와 현재잔액을 출력");
            normalAccount.printBalanceInfo();
            deficitAccount.printBalanceInfo();
            loanAccount.printBalanceInfo();

            System.out.println("\n // 10,000 원씩 출금 수행\n");
            try {
                normalAccount.withdraw(10000);
            } catch (BalanceInsufficientException e) {
                System.out.println(e.getMessage());
            }

            deficitAccount.withdraw(10000);

            if (loanAccount instanceof LoanPossible) {
                ((LoanPossible) loanAccount).lend(10000);
            } else {
                loanAccount.withdraw(10000);
            }
            System.out.println("\n // printBalanceInfo 메서드를 호출하여 계좌정보와 현재잔액을 출력\n");
            normalAccount.printBalanceInfo();
            deficitAccount.printBalanceInfo();
            loanAccount.printBalanceInfo();

        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
