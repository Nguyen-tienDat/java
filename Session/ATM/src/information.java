public class information {
    private String id;
    private String name;
    private String password;
    private double balance;

    public information(String id, String name, String password, int balance) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean deposit(double amount){
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
            return true;
        }
        return false;
    }
}
