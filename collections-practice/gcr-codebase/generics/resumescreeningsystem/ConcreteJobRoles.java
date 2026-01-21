package resumescreeningsystem;

class SoftwareEngineer extends JobRole {

    String requiredSkills() {
        return "Java, DSA, OOPS";
    }
}

class DataScientist extends JobRole {

    String requiredSkills() {
        return "Python, ML, Statistics";
    }
}

class ProductManager extends JobRole {

    String requiredSkills() {
        return "Communication, Planning, Strategy";
    }
}
