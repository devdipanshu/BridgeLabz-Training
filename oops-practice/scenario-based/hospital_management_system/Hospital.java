package hospital_management_system;

import java.util.ArrayList;

import java.util.ArrayList;

class Hospital implements HospitalService {

    static ArrayList<Patient> patients = new ArrayList<Patient>();
    static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    static ArrayList<Appointment> appointments = new ArrayList<Appointment>();

    static int appointmentCounter = 1;

    void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    void removeDoctor(int doctorId){
        for(int i = 0;i < doctors.size();i++){
            if(doctors.get(i).id == doctorId){
                doctors.remove(i);
                return;
            }
        }
    }

    void viewDoctors(){
        System.out.println("Available Doctors:");
        for(int i = 0;i < doctors.size();i++){
            Doctor d = doctors.get(i);
            System.out.println(
                d.id+"  "+d.name+"  "+d.specialization+"  Fee:"+d.fee
            );
        }
    }

    double calculateFee(int doctorId){
        for(int i = 0;i < doctors.size();i++){
            if(doctors.get(i).id == doctorId){
                return doctors.get(i).fee;
            }
        }
        return 0;
    }

    double calculateFee(int doctorId,boolean isHospitalized){
        double fee = calculateFee(doctorId);
        if(isHospitalized){
            fee = fee + 1000;
        }
        return fee;
    }

    public void bookAppointment(Patient patient,int doctorId)
            throws AppointmentNotAvailableException {

        Doctor doctor = null;

        for(int i = 0;i < doctors.size();i++){
            if(doctors.get(i).id == doctorId){
                doctor = doctors.get(i);
                break;
            }
        }

        if(doctor == null){
            throw new AppointmentNotAvailableException("Doctor not available");
        }

        patients.add(patient);

        double fee = calculateFee(doctorId,patient.isHospitalized);

        Appointment ap = new Appointment(
            appointmentCounter,
            patient.name,
            doctor.name,
            fee,
            patient.isHospitalized
        );

        appointments.add(ap);
        patient.medicalHistory.add(ap);

        appointmentCounter++;

        System.out.println("Appointment booked successfully");
    }

    void cancelAppointment(int appointmentId){

        for(int i = 0;i < appointments.size();i++){
            if(appointments.get(i).appointmentId == appointmentId){

                Appointment ap = appointments.get(i);

                for(int j = 0;j < patients.size();j++){
                    Patient p = patients.get(j);

                    for(int k = 0;k < p.medicalHistory.size();k++){
                        if(p.medicalHistory.get(k).appointmentId == appointmentId){
                            p.medicalHistory.remove(k);
                            break;
                        }
                    }
                }

                appointments.remove(i);
                System.out.println("Appointment cancelled");
                return;
            }
        }
        System.out.println("Appointment not found");
    }
    void viewPatients() {
        if(patients.size() == 0) {
            System.out.println("No active patients");
            return;
        }

        for(int i = 0;i<patients.size();i++) {
            Patient p = patients.get(i);
            System.out.println("Patient ID : " + p.id);
            System.out.println("Name : " + p.name);
            System.out.println("Hospitalized : " + p.isHospitalized);
            System.out.println("-------------------");
        }
    }
    void viewAppointments() {
        if(appointments.size() == 0) {
            System.out.println("No appointments available");
            return;
        }

        for(int i = 0;i<appointments.size();i++) {
            Appointment a = appointments.get(i);
            System.out.println("Appointment ID : " + a.appointmentId);
            System.out.println("Patient : " + a.patientName);
            System.out.println("Doctor : " + a.doctorName);
            System.out.println("Fee : " + a.fee);
            System.out.println("Hospitalized : " + a.isHospitalized);
            System.out.println("-------------------");
        }
    }


}

