package hospital_management_system;

class Doctor extends Person {

    double fee;
    String specialization;

    Doctor(String name,int id,String contactInfo,double fee,String specialization){
        super(name,id,contactInfo);
        this.fee = fee;
        this.specialization = specialization;
    }
}
