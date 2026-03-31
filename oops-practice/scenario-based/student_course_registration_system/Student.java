package student_course_registration_system;

import java.util.ArrayList;

class Student extends Person implements RegistrationService {

    boolean isRegistered = false;
    ArrayList<Course> courses = new ArrayList<Course>();
    static final int MAX_COURSES = 2;

    Student(String name,int id,long contactNumber){
        super(name,id,contactNumber);
    }

    public void registerStudent(){
        isRegistered = true;
        System.out.println("Student Registered Successfully");
    }

    void showAvailableCourses(){
        System.out.println("Available Courses:");
        for(int i = 0;i < CourseManagement.courses.size();i++){
            Course c = CourseManagement.courses.get(i);
            System.out.println(c.courseId+"  "+c.courseName+"  "+c.duration+" months");
        }
    }

    public void enrollCourse(Course course) throws CourseLimitExceededException{

        if(isRegistered == false){
            System.out.println("Registration Pending");
            return;
        }

        if(courses.size() >= MAX_COURSES){
            throw new CourseLimitExceededException("Course limit exceeded");
        }

        courses.add(course);
        course.students.add(this);
        System.out.println("Enrolled in course: "+course.courseName);
    }

    void removeCourse(Course course){

        if(isRegistered == false){
            System.out.println("Registration Pending");
            return;
        }

        if(courses.contains(course)){
            courses.remove(course);
            course.students.remove(this);
            System.out.println("Course removed: "+course.courseName);
        }
        else{
            System.out.println("Student not enrolled in this course");
        }
    }
}

