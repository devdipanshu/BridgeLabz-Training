package file_backup_scheduler;

public class Main {
    public static void main(String[] args) {
        BackupScheduler scheduler = new BackupScheduler();

        try{
            scheduler.addTask(new BackupTask("C:/CriticalData",10,"02:00 AM"));
            scheduler.addTask(new BackupTask("D:/Movies",3,"04:00 AM"));
            scheduler.addTask(new BackupTask("E:/Projects",7,"03:00 AM"));
        }
        catch(InvalidBackupPathException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Executing Backup Tasks:");
        scheduler.executeTasks();
    }
}
