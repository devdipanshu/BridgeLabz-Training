package student_course_registration_system;

class GradeManagement {

    void showGrades(Student student){
        System.out.println("Grades for "+student.name);
        for(int i = 0;i < student.courses.size();i++){
            System.out.println(student.courses.get(i).courseName+" : A");
        }
    }
}
