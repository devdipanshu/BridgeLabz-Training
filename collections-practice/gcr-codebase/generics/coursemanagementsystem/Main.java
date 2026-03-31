package coursemanagementsystem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Course<ExamCourse> c1 =
            new Course<>("Data Structures", new ExamCourse());

        Course<AssignmentCourse> c2 =
            new Course<>("Software Engineering", new AssignmentCourse());

        Course<ResearchCourse> c3 =
            new Course<>("AI Research", new ResearchCourse());

        c1.display();
        c2.display();
        c3.display();

        ArrayList<CourseType> allCourses = new ArrayList<>();
        allCourses.add(new ExamCourse());
        allCourses.add(new AssignmentCourse());
        allCourses.add(new ResearchCourse());

        CourseManager.showAllCourses(allCourses);
    }
}
