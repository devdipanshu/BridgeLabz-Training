package coursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

class CourseManager {

    static void showAllCourses(List<? extends CourseType> list) {
        for(int i = 0;i < list.size();i++) {
            System.out.println("Evaluation Type: " + list.get(i).evaluationMethod());
        }
    }
}
