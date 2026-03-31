
public class PensDistribution {
	public static void main(String[]args) {
		int totalPens = 14;
		int totalStudents = 3;
		int remainingPens = totalPens%totalStudents;
		int pensPerStudent = 14/3;
		System.out.println("The Pen Per Student is "+pensPerStudent+" and the remaining pen not distributed is "+remainingPens);
	}
}
