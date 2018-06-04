public class Main {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount("1234");
        doWork(acct1);
    }

    public static void doWork(Object obj) {
        Class<?> theClass = obj.getClass();
        SimpleReflection.showName(theClass);
    }
}
