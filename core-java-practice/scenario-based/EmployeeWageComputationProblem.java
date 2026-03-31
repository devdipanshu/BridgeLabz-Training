import java.util.Scanner;

public class EmployeeWageComputationProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		//Use Case 1: Check employee is absent or present 0 if absent 1 if present
//		int attendance = (int)(Math.random()*2); //0 if absent 1 if present
		
		//Use Case 2: Calculate Daily Employee Wages
//		int wagesPerHour = 20;
//		int fullDayHour = 8;
//		int totalWages = wagesPerHour*fullDayHour;
		
		//Use Case 3: Add Part Time Wages
//		int partTimeHour = 4;
//		int partTimeWages = wagesPerHour*partTimeHour;
		
		//Use Case 4: Solve Using Switch Case
//		System.out.println("Enter if the employee is PartTime or FullTime(Enter 0 for PartTime and 1 for FullTime)");
//		int employeeStatus = sc.nextInt();
//		int wagesPerHour = 0;
//		int partTimeHour = 0;
//		int partTimeWages = 0;
//		int fullDayHour = 0;
//		int totalWages = 0;
//		switch(employeeStatus) {
//		case 0:
//			wagesPerHour = 20;
//			partTimeHour = 4;
//			partTimeWages = wagesPerHour*partTimeHour;
//			break;
//		case 1:
//			wagesPerHour = 20;
//			fullDayHour = 8;
//			totalWages = wagesPerHour*fullDayHour;
//		}
//		
//		//Use Case 5: Calculate Wages for a month
//		int workingDayPerMonth = 20;
//		int wagesPerMonthFullTime =  totalWages*workingDayPerMonth;
//		int wagesPerMonthPartTime =  partTimeWages*workingDayPerMonth;
		
		//Use Case 6: Calculate Wages until a specific condition met
		int hours = 0;
		int days = 0;
		System.out.println("Enter if the employee is PartTime or FullTime(Enter 0 for PartTime and 1 for FullTime)");
		int employeeStatus = sc.nextInt();
		int wagesPerHour = 20;
		int fullDayHour = 8;
		int partTimeHour = 4;
		int totalWages = 0;
		while(hours<100 && days<20) {
			int attendance = (int)(Math.random()*2);
			if(attendance == 1) {
				switch(employeeStatus) {
				case 1:
					totalWages = totalWages + (wagesPerHour * fullDayHour);
					hours += fullDayHour;
					days++;
					System.out.println("Day completed as Full Time employee and earned till now "+totalWages);
					break;
				case 0:
					totalWages = totalWages + (wagesPerHour * partTimeHour);
					hours += partTimeHour;
					days++;
					System.out.println("Day completed as Part Time employee and earned till now "+totalWages);
					break;
				}
			}
			else {
				System.out.println("Employee is absent today");
				System.out.println("--------------------------");
				System.out.println();
			}
		}
		System.out.println("Total Days Worked: " + days);
		System.out.println("Total Hours Worked: " + hours);
		System.out.println("Total Wage Earned: " + totalWages);
		sc.close();
	}
}
