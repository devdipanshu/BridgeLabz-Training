package resumescreeningsystem;

class Resume<T extends JobRole> {

    String candidateName;
    T jobRole;

    Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    void processResume() {
        System.out.println(
            candidateName + " screened for role with skills: "
            + jobRole.requiredSkills()
        );
    }
}
