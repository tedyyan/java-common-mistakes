package javaskill;

public enum InputCommands implements InputCommand {
	QUIT("quit", (sc, bank, current) -> {
		sc.close();
		System.out.println("Goodbye!");
		return -1;
	}), NEW("new", (sc, bank, current) -> {
		System.out.print("Enter account type(1=savings, 2=checking, 3=interest checking): ");
		int type = sc.nextInt();
		boolean isforeign = requestForeign(sc);
		current = bank.newAccount(type, isforeign);
		System.out.println("Your new account number is " + current);
		return current;
	}), SELECT("select", (sc, bank, current) -> {
		System.out.print("Enter account#: ");
		current = sc.nextInt();
		int balance = bank.getBalance(current);
		System.out.println("The balance of account " + current + " is " + balance);
		return current;
	}), DEPOSIT("deposit", (sc, bank, current) -> {
		System.out.print("Enter deposit amount: ");
		int amt = sc.nextInt();
		bank.deposit(current, amt);
		return current;
	}),;

	private String name;
	private InputCommand cmd;

	private InputCommands(String name, InputCommand cmd) {
		this.name = name;
		this.cmd = cmd;
	}

	static boolean requestForeign(Scanner sc) {
		// TODO Auto-generated method stub
		return false;
	}

	public int execute(Scanner sc, Bank bank, int current) {
		return cmd.execute(sc, bank, current);
	}

}
