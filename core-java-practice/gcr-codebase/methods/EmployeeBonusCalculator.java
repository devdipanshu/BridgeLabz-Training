public class EmployeeBonusCalculator{
	public static double[][] generateSalaryAndService(int employees){
		double[][] data=new double[employees][2];
		for(int i=0;i<employees;i++){
			data[i][0]=(int)(Math.random()*90000)+10000;
			data[i][1]=(int)(Math.random()*10)+1;
		}
		return data;
	}
	public static double[][] calculateBonusAndNewSalary(double[][] data){
		double[][] result=new double[data.length][2];
		for(int i=0;i<data.length;i++){
			double salary=data[i][0];
			double years=data[i][1];
			double bonus=0;
			if(years>5){
				bonus=salary*0.05;
			}else{
				bonus=salary*0.02;
			}
			double newSalary=salary+bonus;
			result[i][0]=newSalary;
			result[i][1]=bonus;
		}
		return result;
	}
	public static void displaySalaryBonus(double[][] data,double[][] result){
		double sumOldSalary=0;
		double sumNewSalary=0;
		double sumBonus=0;
		System.out.println("Emp OldSalary Years Bonus NewSalary");
		for(int i=0;i<data.length;i++){
			double oldSalary=data[i][0];
			double years=data[i][1];
			double bonus=result[i][1];
			double newSalary=result[i][0];
			sumOldSalary+=oldSalary;
			sumNewSalary+=newSalary;
			sumBonus+=bonus;
			System.out.println((i+1)+" "+oldSalary+" "+years+" "+bonus+" "+newSalary);
		}
		System.out.println("Total "+sumOldSalary+" "+sumBonus+" "+sumNewSalary);
	}
	public static void main(String[] args){
		int employees=10;
		double[][] salaryAndService=generateSalaryAndService(employees);
		double[][] bonusAndNewSalary=calculateBonusAndNewSalary(salaryAndService);
		displaySalaryBonus(salaryAndService,bonusAndNewSalary);
	}
}
