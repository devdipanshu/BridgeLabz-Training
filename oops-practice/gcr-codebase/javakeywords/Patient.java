public class Patient {
	static String hospitalName = "City Hospital";
	static int totalPatients = 0;

	String name;
	int age;
	String ailment;
	final String patientID;
	Patient(String name,int age,String ailment,String patientID){
		this.name = name;
		this.age = age;
		this.ailment = ailment;
		this.patientID = patientID;
		totalPatients++;
	}
	static void getTotalPatients(){
		System.out.println("Total Patients Admitted: "+totalPatients);
	}
	void display(Patient patient){
		if(patient instanceof Patient){
			System.out.println("Hospital Name: "+hospitalName);
			System.out.println("Patient ID: "+patientID);
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			System.out.println("Ailment: "+ailment);
		}
	}
	public static void main(String[] args) {
		Patient p1 = new Patient("Lathika",30,"Flu","P001");
		Patient p2 = new Patient("Lidiya",45,"Fracture","P002");
		getTotalPatients();
		p1.display(p1);
		p2.display(p2);
	}
}