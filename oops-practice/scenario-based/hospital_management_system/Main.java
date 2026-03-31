package hospital_management_system;

class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        System.out.println("---- ADD DOCTORS ----");
        hospital.addDoctor(new Doctor("Dr. Sharma",101,"99999",500,"Cardiology"));
        hospital.addDoctor(new Doctor("Dr. Mehta",102,"88888",700,"Neurology"));

        System.out.println("---- VIEW DOCTORS ----");
        hospital.viewDoctors();

        System.out.println("---- CREATE PATIENT ----");
        Patient p1 = new Patient("Dipanshu",1,"77777",true);

        System.out.println("---- BOOK APPOINTMENT (AVAILABLE DOCTOR) ----");
        p1.takeAppointment(hospital,101);

        System.out.println("---- BOOK APPOINTMENT (NOT AVAILABLE DOCTOR) ----");
        p1.takeAppointment(hospital,999);   // Exception case

        System.out.println("---- ACTIVE PATIENTS IN HOSPITAL ----");
        hospital.viewPatients();

        System.out.println("---- ACTIVE APPOINTMENTS ----");
        hospital.viewAppointments();

        System.out.println("---- PATIENT MEDICAL HISTORY ----");
        for(int i = 0;i<p1.medicalHistory.size();i++){
            Appointment a = p1.medicalHistory.get(i);
            System.out.println("Appointment ID : "+a.appointmentId+","+
                               " Doctor : "+a.doctorName+","+
                               " Fee : "+a.fee);
        }

        System.out.println("---- CANCEL APPOINTMENT ----");
        p1.cancelAppointment(hospital,1);

        System.out.println("---- APPOINTMENTS AFTER CANCELLATION ----");
        hospital.viewAppointments();
    }
}

