import com.lockward.finances.accounts.BankAccount;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        BankAccount acct1 = new BankAccount("1234");
        doWork(acct1);
        showClassWithName();
    }

    public static void doWork(Object obj) {
        Class<?> theClass = obj.getClass();
        SimpleReflection.showName(theClass);
    }

    public static void showClassWithName() throws ClassNotFoundException {
        Class<?> theClass = Class.forName("com.lockward.finances.accounts.BankAccount");
        SimpleReflection.showName(theClass);
    }
}
