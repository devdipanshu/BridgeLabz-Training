package student_course_registration_system;

import java.util.ArrayList;

class CourseManagement {

    static ArrayList<Course> courses = new ArrayList<Course>();

    static void addCourse(Course course){
        courses.add(course);
    }

    static void removeCourse(int courseId){
        for(int i = 0;i < courses.size();i++){
            if(courses.get(i).courseId == courseId){
                courses.remove(i);
                break;
            }
        }
    }

    static void showCourses(){
        System.out.println("Available Courses:");
        for(int i = 0;i < courses.size();i++){
            Course c = courses.get(i);
            System.out.println(c.courseId+"  "+c.courseName+"  "+c.duration+" months");
        }
    }

    static Course getCourseById(int id){
        for(int i = 0;i < courses.size();i++){
            if(courses.get(i).courseId == id){
                return courses.get(i);
            }
        }
        return null;
    }
}