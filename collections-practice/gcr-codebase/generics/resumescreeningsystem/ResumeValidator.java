package resumescreeningsystem;

class ResumeValidator {

    static <T extends JobRole> void validate(T role) {
        System.out.println(
            "Validating resume for skills: " + role.requiredSkills()
        );
    }
}
