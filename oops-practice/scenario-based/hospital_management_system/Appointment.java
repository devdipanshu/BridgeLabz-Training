package hospital_management_system;

class Appointment {
    int appointmentId;
    String patientName;
    String doctorName;
    double fee;
    boolean isHospitalized;

    Appointment(int appointmentId,String patientName,String doctorName,
                double fee,boolean isHospitalized){
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.fee = fee;
        this.isHospitalized = isHospitalized;
    }
}
