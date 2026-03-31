package file_backup_scheduler;

public class InvalidBackupPathException extends Exception{
    InvalidBackupPathException(String msg){
        super(msg);
    }
}
