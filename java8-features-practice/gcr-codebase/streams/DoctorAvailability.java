
import java.util.ArrayList;
import java.util.List;

public class DoctorAvailability {

    static class Doctor{
        String name;
        String specialty;
        boolean weekendAvailable;

        Doctor(String name,String specialty,boolean weekendAvailable){
            this.name = name;
            this.specialty = specialty;
            this.weekendAvailable = weekendAvailable;
        }
    }

    public static void main(String[] args) {

        List<Doctor> list = new ArrayList<>();

        list.add(new Doctor("Dr. Aman","Cardiology",true));
        list.add(new Doctor("Dr. Riya","Neurology",false));
        list.add(new Doctor("Dr. Karan","Orthopedic",true));
        list.add(new Doctor("Dr. Neha","Dermatology",true));
        list.add(new Doctor("Dr. Rohit","Cardiology",false));

        list.stream()
        .filter(d -> d.weekendAvailable == true)
        .sorted((d1,d2)-> d1.specialty.compareTo(d2.specialty))
        .forEach(d ->
            System.out.println(d.name+" | "+d.specialty+" | Weekend Available")
        );
    }
}
