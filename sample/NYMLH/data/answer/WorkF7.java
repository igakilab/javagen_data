public class WorkF7 {
    public static void main(String[] args) {
        // MyBankAccountクラスのインスタンスを生成します。
        MyBankAccount account = new MyBankAccount();
        
        // setBalanceメソッドを使用し、口座残高を設定します。
        account.setBalance(10000);
        
        // getBalanceメソッドを使用して口座残高を取得し、出力します。
        System.out.println("口座残高: " + account.getBalance() + "円");
        
        // depositメソッドを使用し、5000円を預け入れます。
        account.deposit(5000);
        
        // getBalanceメソッドを使用して口座残高を取得し、出力します。
        System.out.println("口座残高: " + account.getBalance() + "円");
        
        // withdrawメソッドを使用し、3000円を引き出します。
        account.withdraw(3000);
        
        // getBalanceメソッドを使用して口座残高を取得し、出力します。
        System.out.println("口座残高: " + account.getBalance() + "円");
    }
}