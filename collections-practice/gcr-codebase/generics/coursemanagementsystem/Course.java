package coursemanagementsystem;

class Course<T extends CourseType> {

    String courseName;
    T courseType;

    Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    void display() {
        System.out.println(courseName + " | Evaluation: " + courseType.evaluationMethod());
    }
}
