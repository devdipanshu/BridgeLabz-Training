package hospital_management_system;

import java.util.ArrayList;

class Patient extends Person {

    boolean isHospitalized;
    ArrayList<Appointment> medicalHistory = new ArrayList<Appointment>();

    Patient(String name,int id,String contactInfo,boolean isHospitalized){
        super(name,id,contactInfo);
        this.isHospitalized = isHospitalized;
    }

    void takeAppointment(Hospital hospital,int doctorId){
        try{
            hospital.bookAppointment(this,doctorId);
        }
        catch(AppointmentNotAvailableException e){
            System.out.println(e.getMessage());
        }
    }

    void cancelAppointment(Hospital hospital,int appointmentId){
        hospital.cancelAppointment(appointmentId);
    }
}
