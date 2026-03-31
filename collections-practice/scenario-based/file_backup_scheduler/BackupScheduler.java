package file_backup_scheduler;

import java.util.PriorityQueue;

public class BackupScheduler {
    PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    public void addTask(BackupTask task) throws InvalidBackupPathException{
        if(task.path == null || task.path.length() == 0){
            throw new InvalidBackupPathException("Invalid backup path");
        }
        queue.add(task);
    }

    public void executeTasks(){
        while(!queue.isEmpty()){
            BackupTask task = queue.poll();
            task.execute();
        }
    }
}
