package hospital_management_system;

interface HospitalService {

    void bookAppointment(Patient patient,int doctorId)
            throws AppointmentNotAvailableException;
}
