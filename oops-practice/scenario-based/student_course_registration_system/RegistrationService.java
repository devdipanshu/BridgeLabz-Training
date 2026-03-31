package student_course_registration_system;

interface RegistrationService {
    void registerStudent();
    void enrollCourse(Course course) throws CourseLimitExceededException;
}
