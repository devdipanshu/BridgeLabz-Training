import java.util.Scanner;

public class InvoiceGenerator {

	public static String[] parseInvoice(String input) {
		String[] tasks = input.split(",");
		return tasks;
	}
	public static int getTotalAmount(String[] tasks) {
		int total = 0;
		for(int i = 0;i<tasks.length;i++) {
			String task = tasks[i].trim();
			String[] parts = task.split(" ");
			if(parts.length < 2) {
				continue;
			}
			int amount = Integer.parseInt(parts[1]);
			total += amount;
		}
		return total;
	}
	public static void displayInvoice(String[] tasks,int total) {
		System.out.println("----- INVOICE -----");
		for(int i = 0;i<tasks.length;i++) {
			System.out.println(tasks[i].trim());
		}
		System.out.println("Total Amount: "+total+" INR");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter invoice details: ");
		String input = sc.nextLine();
		String[] tasks = parseInvoice(input);
		int total = getTotalAmount(tasks);
		displayInvoice(tasks, total);
		sc.close();
	}
}
