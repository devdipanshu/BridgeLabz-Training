package coursemanagementsystem;

class ExamCourse extends CourseType {

    String evaluationMethod() {
        return "Written Exam";
    }
}

class AssignmentCourse extends CourseType {

    String evaluationMethod() {
        return "Assignments";
    }
}

class ResearchCourse extends CourseType {

    String evaluationMethod() {
        return "Research Work";
    }
}
