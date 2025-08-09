package wip_lab;

	class Person11 {
	    private String name;
	    private float age;

	    public Person11(String name, float age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }
	    public float getAge() { return age; }
	    public void setAge(float age) { this.age = age; }

	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + '}';
	    }
	}

	class Account {
	    private static long accNumGenerator = 100001;
	    private long accNum;
	    private double balance;
	    private Person11 accHolder;

	    public Account(Person11 accHolder, double balance) {
	        if (balance < 500) {
	            throw new IllegalArgumentException("Initial balance must be at least INR 500.");
	        }
	        this.accNum = accNumGenerator++;
	        this.accHolder = accHolder;
	        this.balance = balance;
	    }

	   
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	   
	    public void withdraw(double amount) {
	        if (amount > 0 && balance - amount >= 500) {
	            balance -= amount;
	        } else {
	            System.out.println("Transaction failed: Minimum balance of INR 500 must be maintained.");
	        }
	    }

	  
	    public double getBalance() {
	        return balance;
	    }

	   
	    public long getAccNum() { return accNum; }
	    public Person11 getAccHolder() { return accHolder; }

	    @Override
	    public String toString() {
	        return "Account{accNum=" + accNum +
	               ", balance=" + balance + 
	               ", accHolder=" + accHolder +
	               '}';
	    }
	}

	// Main Demo
	public class lab3_2{
	    public static void main(String[] args) {
	        // a) Create accounts
	        Person11 smith = new Person11("Smith", 30);
	        Person11 kathy = new Person11("Kathy", 28);
	        Account smithAccount = new Account(smith, 2000); // INR 2000
	        Account kathyAccount = new Account(kathy, 3000); // INR 3000

	        // b) Deposit 2000 to Smith's account
	        smithAccount.deposit(2000);

	        // c) Withdraw 2000 from Kathy's account
	        kathyAccount.withdraw(2000);

	        // d) Display updated balances
	        System.out.println("Smith's Account Balance: INR " + smithAccount.getBalance());
	        System.out.println("Kathy's Account Balance: INR " + kathyAccount.getBalance());

	        // e) Display account details using toString()
	        System.out.println("Smith's Account Details: " + smithAccount);
	        System.out.println("Kathy's Account Details: " + kathyAccount);
	    }
	
	}

