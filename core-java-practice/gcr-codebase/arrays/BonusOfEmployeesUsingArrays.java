import java.util.Scanner;

public class BonusOfEmployeesUsingArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[][] info = new double[10][2]; // [row][0]=salary, [row][1]=year of service
		double[][] newPaymentInfo = new double[10][2];

		double totalBonus = 0;
		double totalOldSalary = 0;
		double totalNewSalary = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter salary: ");
			double salary = sc.nextDouble();

			System.out.println("Enter Year of Service: ");
			double yearOfService = sc.nextDouble();

			while (salary < 0 || yearOfService < 0) {
				System.out.println("Enter Salary and Year of Service again");
				salary = sc.nextDouble();
				yearOfService = sc.nextDouble();
			}

			info[i][0] = salary;
			info[i][1] = yearOfService;
		}

		for (int i = 0; i < 10; i++) {
			double bonus;
			if (info[i][1] >= 5) {
				bonus = 5;
			} else {
				bonus = 2;
			}

			double updatedSalary = info[i][0] + (info[i][0] * bonus) / 100;
			double bonusAmount = updatedSalary - info[i][0];

			newPaymentInfo[i][0] = updatedSalary;
			newPaymentInfo[i][1] = bonusAmount;
		}

		for (int i = 0; i < 10; i++) {
			totalBonus += newPaymentInfo[i][1];
			totalOldSalary += info[i][0];
			totalNewSalary += newPaymentInfo[i][0];
		}

		System.out.println("Total Bonus is: " + totalBonus);
		System.out.println("Total old salary is: " + totalOldSalary);
		System.out.println("Total new salary is: " + totalNewSalary);

		sc.close();
	}
}
