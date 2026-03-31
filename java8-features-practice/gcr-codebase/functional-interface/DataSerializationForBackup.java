
interface BackupSerializable{
}
class UserData implements BackupSerializable{
	int id;
	UserData(int id){
		this.id=id;
	}
}
class LogData{
	int code;
	LogData(int code){
		this.code=code;
	}
}
public class DataSerializationForBackup{
	public static void main(String[] args){
		Object[] data={new UserData(1),new LogData(404)};
		for(int i=0;i<data.length;i++){
			if(data[i] instanceof BackupSerializable){
				System.out.println("Backup allowed");
			}else{
				System.out.println("Backup not allowed");
			}
		}
	}
}
