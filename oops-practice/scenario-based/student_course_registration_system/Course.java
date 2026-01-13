package student_course_registration_system;

import java.util.ArrayList;

class Course {
    int courseId;
    String courseName;
    int duration;
    ArrayList<Student> students = new ArrayList<Student>();

    Course(int courseId,String courseName,int duration){
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
    }
}
