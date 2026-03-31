package resumescreeningsystem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
            new Resume<>("Amit", new SoftwareEngineer());

        Resume<DataScientist> r2 =
            new Resume<>("Neha", new DataScientist());

        Resume<ProductManager> r3 =
            new Resume<>("Rahul", new ProductManager());

        r1.processResume();
        r2.processResume();
        r3.processResume();

        ResumeValidator.validate(new SoftwareEngineer());
        ResumeValidator.validate(new DataScientist());

        ArrayList<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningPipeline.screenAll(roles);
    }
}
