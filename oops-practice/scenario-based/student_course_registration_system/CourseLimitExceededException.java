package student_course_registration_system;

class CourseLimitExceededException extends Exception {
    CourseLimitExceededException(String message){
        super(message);
    }
}
