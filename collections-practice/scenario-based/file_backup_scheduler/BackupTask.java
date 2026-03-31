package file_backup_scheduler;

public class BackupTask implements Comparable<BackupTask>{
    String path;
    int priority;   // higher value = higher priority
    String time;

    BackupTask(String path,int priority,String time){
        this.path = path;
        this.priority = priority;
        this.time = time;
    }

    @Override
    public int compareTo(BackupTask b){
        return b.priority - this.priority;   // descending order
    }

    public void execute(){
        System.out.println("Backing up: "+path+" at "+time+" with priority "+priority);
    }
}
