package student_course_registration_system;

class Main {
    public static void main(String[] args) {

        CourseManagement.addCourse(new Course(101,"Java",6));
        CourseManagement.addCourse(new Course(102,"Python",5));

        Student s1 = new Student("Dipanshu",1,9876543210L);

        s1.showAvailableCourses();
        s1.registerStudent();

        try{
            s1.enrollCourse(CourseManagement.courses.get(0));
            s1.enrollCourse(CourseManagement.courses.get(1));
        }
        catch(CourseLimitExceededException e){
            System.out.println(e.getMessage());
        }

        s1.removeCourse(CourseManagement.courses.get(0));
    }
}
