public class Main {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount("1234");
        SimpleReflection.showName(acct1.getClass());
    }
}
