package online_examination_system;

class ExamTimeExpiredException extends Exception {
    ExamTimeExpiredException(String msg) {
        super(msg);
    }
}
